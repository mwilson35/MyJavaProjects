package ecoopoly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class will contain all methods relevant to the game play flow, allow
 * creation of users and allow them to take their turns throughout the game
 */
public class GameManager {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_PURPLE = "\u001B[35m";

	public static final int PLAYERS_NUMBER_MIN = 2;
	public static final int PLAYERS_NUMBER_MAX = 4;

	public static final int EARTH_POINTS_BALANCE_STARTING = 1500;
	public static final int PASS_GO_GREEN_BONUS = 200;

	public static final int START_GAME_POSITION = 1;
	public static final int MOVE_POSITION_MAX = 12;

	public static Player currentPlayer = new Player();
	public static ArrayList<Player> players;
	public static int currentPlayerIndex = 0;

	/**
	 * Invokes all of the methods required for the functionality of the game
	 * (Eco-opoly)
	 */
	public void playGame() {

		boolean endGame = false;
		Scanner scanner = new Scanner(System.in);

		displayMenu(scanner);

		ArrayList<Player> list = createPlayers(scanner);

		players = displayPlayerList(list);

		do {

			currentPlayer = setCurrentPlayer(players);

			endGame = quitGameStartTurn(scanner, currentPlayer);

			if (!endGame) {

				movePlayer(currentPlayer, GameBoard.createMovementBoard());

				endGame = GameBoard.checkArea(scanner, currentPlayer);

				if (!endGame) {

					manageEarthPoints(scanner, currentPlayer, GameBoard.createEcoPropertyBoard());

					endGame = quitGameEndTurn(scanner, currentPlayer);

					if (!endGame) {

						players = rotatePlayer(players);

						currentPlayer = setCurrentPlayer(players);

					} else {

						endGameSummary(currentPlayer, players);

					}

				} else {

					endGameSummary(currentPlayer, players);

				}
			} else {

				endGameSummary(currentPlayer, players);

			}

		} while (!endGame);

		scanner.close();

	}

	/**
	 * Displays the menu at the beginning of the game (Eco-opoly)
	 * 
	 * @param scanner - default scanner class
	 */
	public static void displayMenu(Scanner scanner) {

		System.out.println(ANSI_GREEN + "*'*'*'*'*'*'*'*'*'*'*'*'*'*'");
		System.out.println("~~~ Welcome to Eco-opoly ~~~");
		System.out.println("*'*'*'*'*'*'*'*'*'*'*'*'*'*'" + ANSI_RESET);

		int userInput;

		do {
			System.out.println("~ Menu : ");
			System.out.println("~ 1. Display rules");
			System.out.println("~ 2. Continue to create players");
			System.out.println("~ 3. Exit the game");
			System.out.println();
			System.out.print("Please enter your selection : ");
			userInput = scanner.nextInt();
			System.out.println();

			switch (userInput) {
			case 1:
				displayRules();
				break;
			case 2:
				System.out.println("Starting the game...");
				return;
			case 3:
				System.out.println("Exiting the game...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please enter a number from 1 to 3.");
			}

		} while (userInput != 3);
	}

	/**
	 * Displays the rules of the game (Eco-opoly) to screen if prompted by the
	 * displayMenu method, see {@link GameManager#displayMenu()}
	 */
	public static void displayRules() {

		StringBuilder description = new StringBuilder();

		description.append(ANSI_GREEN + "~~~ Rules ~~~" + ANSI_RESET + "\n");
		description.append("~ 1. Rolling the Dice:\n");
		description.append(
				"\tPlayers take turns rolling two dice and their Earth Guardian Token will be moved along the board accordingly.\n");

		description.append("~ 2. Spaces:\n");
		description.append(
				"\tEco-Property Spaces: Players can purchase eco-friendly properties and invest Earth Points (EP) in sustainable upgrades.\n");
		description.append(
				"\tNeutral Spaces: 'Go Green', and 'Charging Station' are neutral spaces, and will not cost the player anything to land on. Passing 'Go Green' will award the player 200 EP.\n");

		description.append("~ 3. Earth Points (EP):\n");
		description.append(
				"\tAccumulate Earth Points (EP) through passing 'Go-Green' and recieving donations from other players when they land on your eco-properties.\n");

		description.append("~ 4. Sustainable Upgrades:\n");
		description.append(
				"\tPlayers can invest Earth Points (EP) to upgrade their properties with eco-friendly technologies (Solar Arrays), increasing their Earth Points (EP) income from donations.\n");

		description.append("~ 5. Donations:\n");
		description.append(
				"\tWhen landing on an eco-property owned by another player, a donation must be paid to that player and will increase depending on the amount of Solar Arrays they have purchased\n");

		description.append("~ 6. EarthGuardian Tokens:\n");
		description.append(
				"\tPlayers must strategically manage their Earth Guardian, making environmentally conscious decisions to maximize Earth Points (EP) and minimize negative impacts.\n");

		description.append("~ 7. Winning the Game:\n");
		description.append(
				"\tThe game concludes when a player runs out of Earth Points (EP) or a player quits out of the game. The player with the highest total of Earth Points (EP) at the end of the game is declared the ultimate Earth Guardian and wins the Eco-opoly game!\n");

		System.out.println(description.toString());
		System.out.println();
	}

	/**
	 * Creates an Array List containing Players (between {@value PLAYERS_NUMBER_MIN}
	 * and {@value PLAYERS_NUMBER_MAX}) and accepts their names between
	 * {@value Player.PLAYER_NAME_LENGTH_MIN} and
	 * {@value Player.PLAYER_NAME_LENGTH_MAX}. The method will prompt the user to
	 * enter a unique name if a duplicate name is detected.
	 * 
	 * @return players - ArrayList of players created
	 */
	public static ArrayList<Player> createPlayers(Scanner scanner) {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Please enter the number of players (Between " + PLAYERS_NUMBER_MIN + " and "
				+ PLAYERS_NUMBER_MAX + ")");

		int numPlayers = 0;

		ArrayList<Player> players = new ArrayList<>();

		while (true) {
			try {
				numPlayers = scanner.nextInt();

				if (numPlayers < PLAYERS_NUMBER_MIN || numPlayers > PLAYERS_NUMBER_MAX) {
					System.out.println(
							"Please enter a number between " + PLAYERS_NUMBER_MIN + " and " + PLAYERS_NUMBER_MAX);
					continue;
				}
				break;
			} catch (InputMismatchException exception) {
				System.out
						.println("Please enter a number between " + PLAYERS_NUMBER_MIN + " and " + PLAYERS_NUMBER_MAX);
				scanner.nextLine();
			}
		}

		HashSet<String> usedNames = new HashSet<>();

		for (int loop = 0; loop < numPlayers; loop++) {

			String playerName;

			do {
				System.out.println("Enter name for Earth Guardian #" + (loop + 1) + ": ");
				playerName = scanner.next();

				if (playerName.length() < Player.PLAYER_NAME_LENGTH_MIN
						|| playerName.length() > Player.PLAYER_NAME_LENGTH_MAX) {
					System.out.println("Player name must be between " + Player.PLAYER_NAME_LENGTH_MIN + " and "
							+ Player.PLAYER_NAME_LENGTH_MAX + " characters.");
					continue;
				}
				if (usedNames.contains(playerName)) {
					System.out.println("That is a duplicate name, please enter a unique name for each player");
					continue;
				}
				usedNames.add(playerName);

				try {
					players.add(new Player(playerName, START_GAME_POSITION, EARTH_POINTS_BALANCE_STARTING));
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					continue;
				}
				break;
			} while (true);
		}

		System.out.println(players.size() + " Earth Guardians have joined the game!");
		return players;
	}

	/**
	 * Accepts the ArrayList of created players and displays their names to screen
	 * 
	 * @param players - ArrayList of players created
	 * @return players - ArrayList of players created
	 */
	public static ArrayList<Player> displayPlayerList(ArrayList<Player> players) {

		System.out.println(ANSI_GREEN + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~ EARTH GUARDIANS ~~~~~~");

		for (int loop = 0; loop < players.size(); loop++) {
			System.out.println("Guardian #" + (loop + 1) + ": " + players.get(loop).getPlayerName());
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);

		return players;
	}

	/**
	 * Sets the current player to define whose turn it is
	 * 
	 * @param players - ArrayList of players created
	 * @return players - ArrayList of players created
	 */
	public static Player setCurrentPlayer(ArrayList<Player> players) {

		Player currentPlayer = players.get(currentPlayerIndex);
		currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
		return currentPlayer;
	}

	public static ArrayList<Player> rotatePlayer(ArrayList<Player> players) {
		Collections.rotate(players, -1);
		return players;
	}

	/**
	 * Accepts a roll from the rollDice method in the DiceRoller class to determine
	 * how many squares a player should advance during the movement phase of their
	 * turn. See {@link DiceRoller#rollDice()}
	 * 
	 * @param player        - the current player
	 * @param movementBoard - the dice roll of the current player
	 */
	public void movePlayer(Player currentPlayer, ArrayList<Area> movementBoard) {

		int roll = DiceRoller.rollDice();
		int newPosition = currentPlayer.getPosition() + roll;

		System.out.println(currentPlayer.getPlayerName() + ", your current position is "
				+ movementBoard.get(currentPlayer.getPosition() - 1).getName());

		if (newPosition > MOVE_POSITION_MAX) {

			newPosition -= MOVE_POSITION_MAX;

			currentPlayer.setEarthPointsBalance(currentPlayer.getEarthPointsBalance() + PASS_GO_GREEN_BONUS);

			System.out.println(
					ANSI_PURPLE + "*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'");
			System.out.println("You have passed the 'Go-Green' Square " + PASS_GO_GREEN_BONUS
					+ " EP has been added to your balance.");
			System.out.println("Your new Earth Points Balance is " + currentPlayer.getEarthPointsBalance() + " EP");
			System.out.println(ANSI_PURPLE
					+ "*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'" + ANSI_RESET);
		}

		currentPlayer.setPosition(newPosition);

		System.out.println("Your new posiiton is " + movementBoard.get(currentPlayer.getPosition() - 1).getName());

	}

	/**
	 * Method for managing Earth Points throughout the game. Allows the storage of
	 * player owned Eco-Properties in an array list, will display them to screen and
	 * allows the upgrade of Eco-Properties
	 * 
	 * @param scanner          - default scanner class
	 * @param currentPlayer    - the current player
	 * @param ecoPropertyBoard - array list of Eco-Properties present on the game
	 *                         board
	 */
	public static void manageEarthPoints(Scanner scanner, Player currentPlayer,
			ArrayList<EcoProperty> ecoPropertyBoard) {

		System.out.println();
		System.out.println(ANSI_GREEN + "~~~ Manage Earth Points ~~~" + ANSI_RESET);

		System.out.println("Your current Earth Points Balance is : " + currentPlayer.getEarthPointsBalance() + " EP");
		System.out.println(
				"You can now choose an Eco-Property to upgrade, if you own all Eco-Properties within it's corresponding field.");
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

		ArrayList<EcoProperty> ownedEcoPropertyList = new ArrayList<>();

		for (int loop = 0; loop < GameBoard.ECO_PROPERTY_BOARD_SIZE; loop++) {

			if (GameBoard.createEcoPropertyBoard().get(loop).getOwner().equals(currentPlayer)) {

				ownedEcoPropertyList.add(GameBoard.createEcoPropertyBoard().get(loop));
			}
		}

		if (ownedEcoPropertyList.isEmpty()) {
			System.out.println("You do not own any Eco-Properties yet.");

		} else {

			System.out.println("You own the following areas: ");
			for (int loop = 0; loop < ownedEcoPropertyList.size(); loop++) {

				int menuOption = loop + 1;

				ownedEcoPropertyList.get(loop).displayManageResourcesDetails();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.printf("To select the above Eco-Property to upgrade, please enter %d\n", menuOption);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			}

			System.out.println("To continue without upgrading, enter 0.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();

			int userInput = -1;

			while (true) {
				try {
					userInput = scanner.nextInt();
					if (userInput < 0 || userInput > ownedEcoPropertyList.size()) {
						System.out.println("Please enter a number from the options stated above");
						continue;
					}
					break;
				} catch (InputMismatchException exception) {
					System.out.println("Please enter a number from the options stated above");
					scanner.nextLine();
				}
			}

			int option = userInput;

			if (option <= 0 || option > ownedEcoPropertyList.size()) {
				System.out.println("You have chosen to not upgrade any Eco-Properties.");

			} else {

				EcoProperty upgradeProperty = ownedEcoPropertyList.get(option - 1);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("You have chosen " + upgradeProperty.getName());

				if (!(GameBoard.checkFieldOwner(currentPlayer, upgradeProperty))) {

					System.out.println(
							"You cannot upgrade this Eco-Property as you do not own all Eco-Properties within the "
									+ upgradeProperty.getField() + " field.");

				} else if (currentPlayer.getEarthPointsBalance() < upgradeProperty.getUpgradePrice()) {
					System.out.println("You cannot upgrade this Eco-Property as you do not have enough EP.");

				} else if (upgradeProperty.getUpgradeLevel() == 4) {
					System.out.println(
							"This Eco-Property is already carbon negative. Therefore, it cannot be upgraded further.");

				} else {
					currentPlayer.setEarthPointsBalance(
							currentPlayer.getEarthPointsBalance() - upgradeProperty.getUpgradePrice());
					upgradeProperty.setUpgradeLevel(upgradeProperty.getUpgradeLevel() + 1);
					upgradeProperty.updateCurrentFee();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Your new balance is: " + currentPlayer.getEarthPointsBalance() + " EP");
					System.out.println(upgradeProperty.getName() + " has been upgraded with "
							+ upgradeProperty.displayUpgradeLevel() + "(s) and the new donation requirement is "
							+ upgradeProperty.getCurrentFee() + " EP");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
				}
			}
		}
	}

	/**
	 * Enables the player to purchase Eco-Properties throughout the game
	 * 
	 * @param scanner             - default scanner class
	 * @param currentPlayer       - the current player
	 * @param currentPropertyArea - the board position of the current player
	 */
	public static void buyEcoProperty(Scanner scanner, Player currentPlayer, EcoProperty currentPropertyArea) {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("The cost of this Eco-property is: " + currentPropertyArea.getEcoPropertyPrice() + " EP");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

		while (true) {
			System.out.println("Would you like to purchase this Eco-Property? (yes/no)");

			String input = scanner.next();

			if (input.equalsIgnoreCase("yes")) {

				if (currentPlayer.getEarthPointsBalance() >= currentPropertyArea.getEcoPropertyPrice()) {

					currentPlayer.setEarthPointsBalance(
							currentPlayer.getEarthPointsBalance() - currentPropertyArea.getEcoPropertyPrice());

					currentPropertyArea.setOwner(currentPlayer);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("You have purchased: " + currentPropertyArea.getName());
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println(
							"Your new Earth Points Balance is: " + currentPlayer.getEarthPointsBalance() + " EP");
					System.out.println("Your new Eco-Property details are: ");
					System.out.println("~");
					currentPropertyArea.displayAreaDetails();
					System.out.println("~");

					break;
				} else {

					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("You do not have enough Earth Points to purchase this Eco-Property");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

					break;
				}
			} else if (input.equalsIgnoreCase("no")) {

				System.out.println("You have chosen not to purchase this Eco-Property.");

				break;
			} else {

				System.out.println("Please enter 'yes' or 'no' only.");

				continue;
			}
		}
	}

	/**
	 * Enables the player to pay donations if they land on an Eco-Property owned by
	 * another player. Updates the Eco-Properties Earth Points Balance with the
	 * calculated donation amount.
	 * 
	 * @param currentPlayer       - the current player
	 * @param currentPropertyArea - the board position of the current player
	 * @return endGame - returns true if the player does not have sufficient funds
	 *         to cover the donation amount, if the donation is paid returns false
	 */
	public static boolean payDonation(Player currentPlayer, EcoProperty currentPropertyArea) {

		boolean endGame = false;

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(currentPlayer.getPlayerName() + " must pay a donation of "
				+ currentPropertyArea.getOwner().getPlayerName() + " " + currentPropertyArea.getCurrentFee()
				+ " EP, as " + currentPropertyArea.getOwner().getPlayerName() + " owns this Eco-Property");

		if (currentPlayer.getEarthPointsBalance() >= currentPropertyArea.getCurrentFee()) {

			currentPlayer
					.setEarthPointsBalance(currentPlayer.getEarthPointsBalance() - currentPropertyArea.getCurrentFee());

			currentPropertyArea.getOwner().setEarthPointsBalance(
					currentPropertyArea.getOwner().getEarthPointsBalance() + currentPropertyArea.getCurrentFee());

			System.out.println(currentPlayer.getPlayerName() + ", your new balance is "
					+ currentPlayer.getEarthPointsBalance() + " EP");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

			endGame = false;

		} else {

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(currentPlayer.getPlayerName() + "must pay " + currentPropertyArea.getOwner() + " "
					+ currentPropertyArea.getCurrentFee() + " EP, as " + currentPropertyArea.getOwner()
					+ " owns this Eco-Property");
			System.out.println("You have insufficient funds to pay the donation required, the game is over.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

			endGame = true;

		}

		return endGame;
	}

	/**
	 * Checks if the player wishes to continue playing at the start of their turn
	 * 
	 * @param scanner       - default scanner class
	 * @param currentPlayer - the current player
	 * @return endGame - returns true if the player wishes to stop playing,
	 *         otherwise returns false
	 */
	public static boolean quitGameStartTurn(Scanner scanner, Player currentPlayer) {

		boolean endGame = false;

		System.out.println(ANSI_RED + currentPlayer.getPlayerName() + ANSI_RESET + ", it is your turn.");
		System.out.println("Do you wish to continue playing? (yes/no)");

		String input;
		input = scanner.next();

		if (input.equalsIgnoreCase("yes")) {
			System.out.println("Your Earth Points Balance is: " + currentPlayer.getEarthPointsBalance() + " EP");
			System.out.println("Time to roll the dice!");

			endGame = false;

		} else if (input.equalsIgnoreCase("no")) {
			System.out.println(
					currentPlayer.getPlayerName() + ", you have chosen not to continue. The game will now end.");
			endGame = true;

		} else {
			System.out.println("Do you wish to continue playing? Please enter 'yes' or 'no' only.");
		}

		return endGame;
	}

	/**
	 * Checks if the player wishes to continue playing at the end of their turn
	 * 
	 * @param scanner       - default scanner class
	 * @param currentPlayer - the current player
	 * @return endGame - returns true if the player wishes to stop playing,
	 *         otherwise returns false
	 */
	public static boolean quitGameEndTurn(Scanner scanner, Player currentPlayer) {

		boolean endGame = false;

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(ANSI_RED + currentPlayer.getPlayerName() + ANSI_RESET + ", it is the end your turn.");
		System.out.println("Do you wish to continue playing? (yes/no)");

		String input;
		input = scanner.next();

		if (input.equalsIgnoreCase("yes")) {

			endGame = false;

		} else if (input.equalsIgnoreCase("no")) {
			System.out.println(
					currentPlayer.getPlayerName() + ", you have chosen not to continue. The game will now end.");
			endGame = true;

		} else {
			System.out.println("Do you wish to continue playing? Please enter 'yes' or 'no' only.");
		}

		return endGame;
	}

	/**
	 * Prints to screen a summary of the game when the game is ended. The winner
	 * (whoever has the highest Earth Points Balance) is announced as the winner.
	 * The rest of the players are put in order. If a draw occurs, it will be
	 * declared
	 * 
	 * @param currentPlayer
	 * @param players
	 */
	public static void endGameSummary(Player currentPlayer, ArrayList<Player> players) {

		players.remove(0);

		if (players.size() == 1) {

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(players.get(0).getPlayerName() + " has won the game with an Earth Points Balance of "
					+ players.get(0).getEarthPointsBalance() + " EP");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		} else {

			Collections.sort(players, new SortPlayers());

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Remaining players sorted by Earth Points Balance:\n");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

			for (Player player : players) {

				System.out.println(player.getPlayerName() + " has " + player.getEarthPointsBalance() + " EP");
			}

			if (players.get(0).getEarthPointsBalance() > players.get(1).getEarthPointsBalance()) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(players.get(0).getPlayerName() + " has won the game.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else {
				System.out.println(
						"There is a draw with more than two or more players having equivalent Earth Points Balance");
			}
		}
	}
}

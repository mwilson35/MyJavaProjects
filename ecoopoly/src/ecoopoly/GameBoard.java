/**
 * This package contains all the methods for the setup and game play of the Eco-opoly board game, including object instantiation and game play functionality.
 * @author Nathan McCourt, Donal McCartney
 */
package ecoopoly;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class GameBoard {

	public static final int ECO_PROPERTY_BOARD_SIZE = 10;
	private static ArrayList<EcoProperty> ecoPropertyBoard = new ArrayList<>();
	public static Player unowned = new Player();

	private static NeutralArea p1 = new NeutralArea("Go-Green", 1, Field.NEUTRAL);

	private static EcoProperty p2 = new EcoProperty("Solar Meadows", 2, Field.RENEWABLE_RESOURCES, unowned, 150, 75, 15,
			50, 750, 15, 0);
	private static EcoProperty p3 = new EcoProperty("Windy Heights", 3, Field.RENEWABLE_RESOURCES, unowned, 190, 75, 20,
			60, 850, 20, 0);
	private static EcoProperty p4 = new EcoProperty("Hydroelectric Dam", 4, Field.RENEWABLE_RESOURCES, unowned, 210, 75,
			25, 70, 900, 25, 0);
	private static EcoProperty p5 = new EcoProperty("Bio-Dome Gardens", 5, Field.BOTANICAL_BLISS, unowned, 350, 200, 75,
			200, 1550, 55, 0);
	private static EcoProperty p6 = new EcoProperty("Eco-Forest Reserve", 6, Field.BOTANICAL_BLISS, unowned, 400, 75,
			70, 200, 1750, 55, 0);
	private static NeutralArea p7 = new NeutralArea("Charging Station", 7, Field.NEUTRAL);
	private static EcoProperty p8 = new EcoProperty("Green City Plaza", 8, Field.URBAN_EDEN, unowned, 150, 100, 15, 75,
			850, 15, 0);
	private static EcoProperty p9 = new EcoProperty("Clean Energy Park", 9, Field.URBAN_EDEN, unowned, 200, 100, 25, 85,
			950, 25, 0);
	private static EcoProperty p10 = new EcoProperty("Ryclcing Centre", 10, Field.URBAN_EDEN, unowned, 250, 100, 45, 95,
			1050, 45, 0);
	private static EcoProperty p11 = new EcoProperty("Ocean Oasis", 11, Field.REEF_RENEWAL, unowned, 80, 60, 10, 20,
			450, 10, 0);
	private static EcoProperty p12 = new EcoProperty("Recycle Avenue", 12, Field.REEF_RENEWAL, unowned, 90, 75, 15, 30,
			550, 15, 0);

	private static ArrayList<Area> boardPosition = new ArrayList<>();

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Area> createMovementBoard() {

		boardPosition.add(p1);
		boardPosition.add(p2);
		boardPosition.add(p3);
		boardPosition.add(p4);
		boardPosition.add(p5);
		boardPosition.add(p6);
		boardPosition.add(p7);
		boardPosition.add(p8);
		boardPosition.add(p9);
		boardPosition.add(p10);
		boardPosition.add(p11);
		boardPosition.add(p12);

		return boardPosition;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<EcoProperty> createEcoPropertyBoard() {

		ecoPropertyBoard.add(p2);
		ecoPropertyBoard.add(p3);
		ecoPropertyBoard.add(p4);
		ecoPropertyBoard.add(p5);
		ecoPropertyBoard.add(p6);
		ecoPropertyBoard.add(p8);
		ecoPropertyBoard.add(p9);
		ecoPropertyBoard.add(p10);
		ecoPropertyBoard.add(p11);
		ecoPropertyBoard.add(p12);

		return ecoPropertyBoard;
	}

	public static boolean checkArea(Scanner scanner, Player currentPlayer) {

		Area currentArea = createMovementBoard().get(currentPlayer.getPosition() - 1);

		if (currentArea.getField().equals(Field.NEUTRAL)) {
			System.out.println(
					"You are in the " + currentArea.getName() + " area. This is the end of your movement turn.");
			return false;
		}

		EcoProperty currentPropertyArea = (EcoProperty) currentArea;
		if (currentPropertyArea.getOwner() == unowned) {
			GameManager.buyEcoProperty(scanner, currentPlayer, currentPropertyArea);
		} else if (currentPropertyArea.getOwner() == currentPlayer) {
			System.out.println("You own this area.");
		} else {
			System.out
					.println("This Eco-Property is owned by: " + currentPropertyArea.getOwner().getPlayerName());
			return GameManager.payDonation(currentPlayer, currentPropertyArea);
		}

		return false;
	}

	/**
	 * 
	 * @param currentPlayer
	 * @param targetArea
	 * @return
	 */
	public static boolean checkFieldOwner(Player currentPlayer, EcoProperty targetArea) {
		Field targetField = targetArea.getField();

		for (EcoProperty ecoProperty : ecoPropertyBoard) {
			// Check if the eco property is in the same field as the target area and is not
			// owned by the current player
			if (ecoProperty.getField() == targetField && !ecoProperty.getOwner().equals(currentPlayer)) {
				return false; // If any eco property is not owned by the current player, return false
			}
		}

		// If all areas in the same field are owned by the current player, return true
		return true;
	}

}

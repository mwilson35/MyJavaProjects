package ecoopoly;

import java.util.Random;

/**
 * This class contains methods to create a player object
 */
public class Player {

	public static final int PLAYER_NAME_LENGTH_MIN = 1;
	public static final int PLAYER_NAME_LENGTH_MAX = 20;
	public static final int EARTH_POINTS_BALANCE_MIN = 0;

	private String playerName;
	private int position;
	private int earthPointsBalance;

	/**
	 * Default constructor for creating a player
	 */
	public Player() {

	}

	/**
	 * Constructor with arguments for creating a player
	 * 
	 * @param playerName         - the name of the player
	 * @param position           - the position of the player on the game board
	 * @param earthPointsBalance - the Earth Points Balance of the player
	 * @throws IllegalArgumentException - if any of the arguments fall outside the
	 *                                  validated range
	 */
	public Player(String playerName, int position, int earthPointsBalance) throws IllegalArgumentException {
		this.setPlayerName(playerName);
		this.setPosition(position);
		this.setEarthPointsBalance(earthPointsBalance);
	}

	/**
	 * @return playerName - the name of the player
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName - the name of the player
	 * @throws IllegalArgumentException - if the name of the player is less than
	 *                                  {@value PLAYER_NAME_LENGTH_MIN} or greater
	 *                                  than {@value PLAYER_NAME_LENGTH_MAX}
	 *                                  characters.
	 */
	public void setPlayerName(String playerName) throws IllegalArgumentException {
		if (playerName.length() > PLAYER_NAME_LENGTH_MIN && playerName.length() < PLAYER_NAME_LENGTH_MAX) {
			this.playerName = playerName;
		} else {
			throw new IllegalArgumentException("Invalid player name length. Please enter a name between "
					+ PLAYER_NAME_LENGTH_MIN + " and " + PLAYER_NAME_LENGTH_MAX + " characters");
		}
	}

	/**
	 * @return position - the position of the player
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position - the position of the player
	 * @throws IllegalArgumentException - if the position of the player outside the
	 *                                  range of the board, the player position must
	 *                                  be between
	 *                                  {@value BoardSquare.BOARD_SQUARE_LOCATION_MIN}
	 *                                  and
	 *                                  {@value BoardSquare.BOARD_SQUARE_LOCATION_MAX}
	 */
	public void setPosition(int position) throws IllegalArgumentException {
		if (position >= Area.BOARD_SQUARE_LOCATION_MIN && position <= Area.BOARD_SQUARE_LOCATION_MAX) {
			this.position = position;
		} else {
			throw new IllegalArgumentException("Invalid position: " + position);
		}
	}

	/**
	 * @return earthPointsBalance - the Earth Points Balance of the player
	 */
	public int getEarthPointsBalance() {
		return earthPointsBalance;
	}

	/**
	 * @param earthPointsBalance - the Earth Points Balance of the player
	 * @throws IllegalArgumentException - if the players Earth Points Balance is
	 *                                  less than {@value EARTH_POINTS_BALANCE_MIN}
	 */
	public void setEarthPointsBalance(int earthPointsBalance) throws IllegalArgumentException {
		if (earthPointsBalance >= EARTH_POINTS_BALANCE_MIN) {
			this.earthPointsBalance = earthPointsBalance;
		} else {
			throw new IllegalArgumentException("Invalid Earth Points Balance. Earth Points Balance cannot be less than "
					+ EARTH_POINTS_BALANCE_MIN);
		}
	}

}

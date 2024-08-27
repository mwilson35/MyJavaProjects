
package ecoopoly;

/**
 * This class contains methods to create a board square object as a base to a
 * neutral board square or EcoProperty board square
 */
public abstract class Area {

	public static final int BOARD_SQUARE_LOCATION_MIN = 0;
	public static final int BOARD_SQUARE_LOCATION_MAX = 12;
	public static final int BOARD_SQUARE_NAME_LENGTH_MIN = 1;
	public static final int BOARD_SQUARE_NAME_LENGTH_MAX = 20;

	private String name;
	private int boardSquareLocation;
	private Field field;

	/**
	 * Default constructor for creating a board square
	 */
	public Area() {

	}

	/**
	 * Constructor with arguments for creating a board square
	 * 
	 * @param field               - The name of field for the grouping and owning of
	 *                            board squares by a player
	 * @param name                - The name of the board square
	 * @param boardSquareLocation - The location of the board square within the
	 *                            board
	 * @param field               - The name of field for the grouping and owning
	 * @throws IllegalArgumentException - if any of the arguments fall outside the
	 *                                  validated range
	 */
	public Area(String name, int boardSquareLocation, Field field) throws IllegalArgumentException {
		this.setName(name);
		this.setBoardSquareLocation(boardSquareLocation);
		this.setField(field);
	}

	/**
	 * @return - The name of the board square
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name - The name of the board square
	 * @throws IllegalArgumentException - if the name is null, or if the length is
	 *                                  less than
	 *                                  {@value BOARD_SQUARE_NAME_LENGTH_MIN} or
	 *                                  more than
	 *                                  {@value BOARD_SQUARE_NAME_LENGTH_MAX}
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null");
		} else if (name.length() > BOARD_SQUARE_NAME_LENGTH_MIN && name.length() < BOARD_SQUARE_NAME_LENGTH_MAX) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Invalid name length, please enter a name between "
					+ BOARD_SQUARE_NAME_LENGTH_MIN + " and " + BOARD_SQUARE_NAME_LENGTH_MAX + " characters");
		}

	}

	/**
	 * @return the boardSquareLocation - The location of the board square within the
	 *         board
	 */
	public int getBoardSquareLocation() {
		return boardSquareLocation;
	}

	/**
	 * 
	 * @param boardSquareLocation - The location of the board square within the
	 *                            board
	 * @throws IllegalArgumentException - if the value is less than
	 *                                  {@value BOARD_SQUARE_LOCATION_MIN} or more
	 *                                  than {@value BOARD_SQUARE_LOCATION_MAX}
	 */
	public void setBoardSquareLocation(int boardSquareLocation) throws IllegalArgumentException {
		if (boardSquareLocation >= BOARD_SQUARE_LOCATION_MIN && boardSquareLocation <= BOARD_SQUARE_LOCATION_MAX) {
			this.boardSquareLocation = boardSquareLocation;
		} else {
			throw new IllegalArgumentException("Board Square does not exist. Please enter a value between "
					+ BOARD_SQUARE_LOCATION_MIN + " and " + BOARD_SQUARE_LOCATION_MAX);

		}
	}

	/**
	 * @return field - The name of field for the grouping and owning
	 */
	public Field getField() {
		return field;
	}

	/**
	 * 
	 * @param field - The name of field for the grouping and owning
	 * @throws IllegalArgumentException - if the field is null
	 */
	public void setField(Field field) throws IllegalArgumentException {
		if (field == null) {
			throw new IllegalArgumentException("Field cannot be null");
		} else {
			this.field = field;
		}
	}

}

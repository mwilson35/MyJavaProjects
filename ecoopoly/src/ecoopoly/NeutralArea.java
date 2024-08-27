
package ecoopoly;

/**
 * This class contains methods for creating a neutral board square object that
 * may or may not be owned by a player.
 */
public class NeutralArea extends Area {

	/**
	 * Default constructor for creating a neutral board square
	 */
	public NeutralArea() {

	}

	/**
	 * @param name                - The name of the board square
	 * @param boardSquareLocation - The location of the board square within the
	 *                            board
	 * @param field               - The name of field for the grouping and owning of
	 *                            board squares by a player
	 */
	public NeutralArea(String name, int boardSquareLocation, Field field) {
		super(name, boardSquareLocation, field);
	}

}

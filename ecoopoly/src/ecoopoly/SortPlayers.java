/**
 * 
 */
package ecoopoly;

import java.util.Comparator;

/**
 * 
 */
public class SortPlayers implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {

		return o2.getEarthPointsBalance() - o1.getEarthPointsBalance();

	}

}

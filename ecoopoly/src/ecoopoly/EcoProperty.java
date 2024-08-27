
package ecoopoly;

/**
 * This class will contain methods for creating an EcoProperty board square
 * which will have a purchase cost associated with it. Once purchased by a
 * player it can be upgraded with solar panels, and other players will have to
 * pay a donation if they land there.
 */
public class EcoProperty extends Area {

	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static final int ECO_PROPERTY_PRICE_MIN = 0;
	public static final int UPGRADE_PRICE_MIN = 0;
	public static final int FEE_MIN = 0;
	public static final int ECO_PROPERTY_UPGRADE_LEVEL_MIN = 0;
	public static final int ECO_PROPERTY_UPGRADE_LEVEL_MAX = 4;

	private Player owner;
	private int ecoPropertyPrice;
	private int upgradePrice;
	private int ecoPropertyFee;
	private int solarPanelArrayFee;
	private int carbonNegativePropertyFee;
	private int currentFee;
	private int upgradeLevel;

	/**
	 * Default constructor for creating an Eco-Property
	 */
	public EcoProperty() {

	}

	/**
	 * @param owner                     - the owner of the Eco-Property
	 * @param ecoPropertyPrice          - the purchase cost of the Eco-Property
	 * @param upgradePrice              - the upgrade price of an Eco-Property
	 * @param ecoPropertyFee            - the fee cost if another player lands on
	 *                                  the property (if it is owned by another
	 *                                  player)
	 * @param solarPanelArrayFee        - the additional fee cost if another player
	 *                                  lands on the property (if it is owned by
	 *                                  another player)
	 * @param carbonNegativePropertyFee - the additional fee cost if another player
	 *                                  lands on the property (if it is owned by
	 *                                  another player)
	 * @param currentFee                - the current total fee of an Eco-Property
	 *                                  if a player who is not the owner lands on
	 *                                  the area
	 * @param upgradeLevel              - the development level of the Eco-Property
	 */
	public EcoProperty(String name, int boardSquareLocation, Field field, Player owner, int ecoPropertyPrice,
			int upgradePrice, int ecoPropertyFee, int solarPanelArrayFee, int carbonNegativePropertyFee, int currentFee,
			int upgradeLevel) {
		super(name, boardSquareLocation, field);
		this.owner = owner;
		this.setEcoPropertyPrice(ecoPropertyPrice);
		this.setUpgradePrice(upgradePrice);
		this.setEcoPropertyFee(ecoPropertyFee);
		this.setSolarPanelArrayFee(solarPanelArrayFee);
		this.setCarbonNegativePropertyFee(carbonNegativePropertyFee);
		this.currentFee = currentFee;
		this.setUpgradeLevel(upgradeLevel);
	}

	/**
	 * @return owner - the owner of the Eco-Property
	 */
	public Player getOwner() {
		return owner;
	}

	/**
	 * 
	 * @param owner - the owner of the Eco-Property
	 * @throws IllegalArgumentException - if the owner is set as null
	 */
	public void setOwner(Player owner) throws IllegalArgumentException {
		if (owner != null) {
			this.owner = owner;
		} else {
			throw new IllegalArgumentException("Owner cannot be set as null");
		}
	}

	/**
	 * @return ecoPropertyPrice - the purchase cost of the Eco-Property
	 */
	public int getEcoPropertyPrice() {
		return ecoPropertyPrice;
	}

	/**
	 * @param ecoPropertyPrice - the purchase price of the Eco-Property
	 * @throws IllegalArgumentException - if the purchase cost is less than
	 *                                  {@value PURCHASE_COST_MIN}
	 */
	public void setEcoPropertyPrice(int ecoPropertyPrice) throws IllegalArgumentException {
		if (ecoPropertyPrice >= ECO_PROPERTY_PRICE_MIN) {
			this.ecoPropertyPrice = ecoPropertyPrice;
		} else {
			throw new IllegalArgumentException("Invalid purchase cost");
		}
	}

	/**
	 * @return upgradePrice - the upgrade price of an EcoProperty
	 */
	public int getUpgradePrice() {
		return upgradePrice;
	}

	/**
	 * @param upgradePrice - the upgrade price of an Eco-Property
	 * @throws IllegalArgumentException - if the upgrade price is less than
	 *                                  {@value UPGRADE_PRICE_MIN}
	 */
	public void setUpgradePrice(int upgradePrice) {
		if (upgradePrice >= UPGRADE_PRICE_MIN) {
			this.upgradePrice = upgradePrice;
		} else {
			throw new IllegalArgumentException("Invalid upgrade price");
		}
	}

	/**
	 * @return ecoPropertyFee - the fee cost if another player lands on the property
	 *         (if it is owned by another player)
	 */
	public int getEcoPropertyFee() {
		return ecoPropertyFee;
	}

	/**
	 * @param ecoPropertyFee - the fee cost if another player lands on the property
	 *                       (if it is owned by another player)
	 * @throws IllegalArgumentException - if the fee is less than {@value FEE_MIN}
	 */
	public void setEcoPropertyFee(int ecoPropertyFee) {
		if (ecoPropertyFee >= FEE_MIN) {
			this.ecoPropertyFee = ecoPropertyFee;
		} else {
			throw new IllegalArgumentException("Invalid fee amount");
		}
	}

	/**
	 * @return solarPanelArrayFee - the additional fee cost if another player lands
	 *         on the property (if it is owned by another player)
	 */
	public int getSolarPanelArrayFee() {
		return solarPanelArrayFee;
	}

	/**
	 * @param solarPanelArrayFee - the additional fee cost if another player lands
	 *                           on the property (if it is owned by another player)
	 * @throws IllegalArgumentException - if the fee is less than {@value FEE_MIN}
	 * 
	 */
	public void setSolarPanelArrayFee(int solarPanelArrayFee) {
		if (solarPanelArrayFee >= FEE_MIN) {
			this.solarPanelArrayFee = solarPanelArrayFee;
		} else {
			throw new IllegalArgumentException("Invalid fee amount");
		}
	}

	/**
	 * @return carbonNegativeFee - the additional fee cost if another player lands
	 *         on the property (if it is owned by another player)
	 */
	public int getCarbonNegativePropertyFee() {
		return carbonNegativePropertyFee;
	}

	/**
	 * @param carbonNegativePropertyFee - the additional fee cost if another player
	 *                                  lands on the property (if it is owned by
	 *                                  another player)
	 * @throws IllegalArgumentException - if the fee is less than {@value FEE_MIN}
	 */
	public void setCarbonNegativePropertyFee(int carbonNegativePropertyFee) {
		if (carbonNegativePropertyFee >= FEE_MIN) {
			this.carbonNegativePropertyFee = carbonNegativePropertyFee;
		} else {
			throw new IllegalArgumentException("Invalid fee amount");
		}
	}

	/**
	 * @return currentFee - the current total fee of an Eco-Property if a player who
	 *         is not the owner lands on the area
	 */
	public int getCurrentFee() {
		return currentFee;
	}

	/**
	 * @param currentFee - the current total fee of an Eco-Property if a player who
	 *                   is not the owner lands on the area
	 */
	public void setCurrentFee(int currentFee) {
		this.currentFee = currentFee;
	}

	/**
	 * @return upgradeLevel - the upgrade level of the Eco-Property
	 */
	public int getUpgradeLevel() {
		return upgradeLevel;
	}

	/**
	 * @param upgradeLevel - the upgrade level of the Eco-Property
	 * @throws IllegalArgumentException - if the upgrade level is less than
	 *                                  {@value ECO_PROPERTY_UPGRADE_LEVEL_MIN} or
	 *                                  greater than
	 *                                  {@value ECO_PROPERTY_UPGRADE_LEVEL_MAX}
	 */
	public void setUpgradeLevel(int upgradeLevel) {

		if (upgradeLevel >= ECO_PROPERTY_UPGRADE_LEVEL_MIN && upgradeLevel <= ECO_PROPERTY_UPGRADE_LEVEL_MAX) {
			this.upgradeLevel = upgradeLevel;
		} else {
			throw new IllegalArgumentException("Invalid upgrade level");
		}
	}

	/**
	 * Returns the corresponding description to the current upgrade level of an
	 * Eco-Property
	 * 
	 * @return upgradeLevel - the upgrade level of the Eco-Property
	 */
	public String displayUpgradeLevel() {

		int upgradeLevelNumber = this.upgradeLevel;
		String upgradeLevel = "default";

		switch (upgradeLevelNumber) {

		case 0:
			upgradeLevel = "No Development";
			break;
		case 1:
			upgradeLevel = "1 Solar Panel Array";
			break;
		case 2:
			upgradeLevel = "2 Solar Panel Arrays";
			break;
		case 3:
			upgradeLevel = "3 Solar Panel Arrays";
			break;
		case 4:
			upgradeLevel = "Carbon Negative Property";
			break;

		default:
			upgradeLevel = "default";
		}

		return upgradeLevel;

	}

	/**
	 * Update the current fee of an Eco-Property dependent on the current upgrade
	 * level
	 */
	public void updateCurrentFee() {

		if (this.upgradeLevel > ECO_PROPERTY_UPGRADE_LEVEL_MIN && this.upgradeLevel < ECO_PROPERTY_UPGRADE_LEVEL_MAX) {

			this.setCurrentFee(this.getSolarPanelArrayFee() * this.upgradeLevel);

		} else {
			// property developmentLevel = 4, hence office fee is set
			this.setCurrentFee(this.getCarbonNegativePropertyFee());
		}
	}

	/**
	 * Display all details of an Eco-Property when a player lands on it
	 */
	public void displayAreaDetails() {

		StringBuilder details = new StringBuilder();
		String newLine = "\n";

		details.append("Name: ").append(this.getName()).append(newLine);
		details.append("Field: ").append(this.getField()).append(newLine);
		details.append("Current Upgrade level: ").append(this.displayUpgradeLevel()).append(newLine);
		details.append("Current Donation Amount: ").append(this.getCurrentFee()).append(" EP").append(newLine);
		details.append("Owner: ").append(this.getOwner().getPlayerName());

		System.out.println(details.toString());
	}

	/**
	 * Displays all of the specific details of an Eco-Property area during the
	 * Manage Resources method
	 */
	public void displayManageResourcesDetails() {

		StringBuilder details = new StringBuilder();
		String newLine = "\n";

		if (this.getField() == Field.BOTANICAL_BLISS) {
			details.append(ANSI_GREEN);
		} else if (this.getField() == Field.REEF_RENEWAL) {
			details.append(ANSI_BLUE);
		} else if (this.getField() == Field.URBAN_EDEN) {
			details.append(ANSI_YELLOW);
		} else if (this.getField() == Field.RENEWABLE_RESOURCES) {
			details.append(ANSI_PURPLE);
		} else {
			details.append(ANSI_RESET);
		}

		details.append("Name: ").append(this.getName()).append(newLine);
		details.append("Field: ").append(this.getField()).append(newLine);
		details.append("Current Upgrade level: ").append(this.displayUpgradeLevel()).append(newLine);
		details.append("Current Donation Amount: ").append(this.getCurrentFee()).append(" EP").append(newLine);
		details.append("Uprade Price: ").append(this.getUpgradePrice()).append(" EP" + ANSI_RESET);

		System.out.println(details.toString());

	}

}

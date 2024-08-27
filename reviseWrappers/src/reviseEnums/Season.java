package reviseEnums;

public enum Season {
	
	WINTER("cold"),SUMMER("hot");
	
	private String description;

	private Season(String description) {
		this.description= description;
		
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

}

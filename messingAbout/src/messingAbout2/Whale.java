/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class Whale extends Animals {
	private String mainOcean;
	private String weight;
	private String maxSpeed;
	private String length;
	/**
	 * @return the mainOcean
	 */
	public String getMainOcean() {
		return mainOcean;
	}
	/**
	 * @param mainOcean the mainOcean to set
	 */
	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}
	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	/**
	 * @return the maxSpeed
	 */
	public String getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Whale [mainOcean=" + mainOcean + ", weight=" + weight + ", maxSpeed=" + maxSpeed + ", length=" + length
				+ ", getName()=" + getName() + "]";
	}
	/**
	 * @param name
	 * @param mainOcean
	 * @param weight
	 * @param maxSpeed
	 * @param length
	 */

	

}

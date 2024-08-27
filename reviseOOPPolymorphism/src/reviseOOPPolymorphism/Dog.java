/**
 * 
 */
package reviseOOPPolymorphism;

/**
 * 
 */
public class Dog extends Animal {

	private int licenseNo;

	@Override
	public void makeNoise() {
		System.out.println("Dog goes woof");
	}

	/**
	 * @return the licenseNo
	 */
	public int getLicenseNo() {
		return licenseNo;
	}

	/**
	 * @param licenseNo the licenseNo to set
	 */
	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

		

}

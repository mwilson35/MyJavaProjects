/**
 * 
 */
package messingAbout2;

/**
 * 
 */
public class Calculator {
	private int memory;

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}public int subtract(int num1, int num2) {
		return num1-num2;
	}public int multiply(int num1, int num2) {
		return num1*num2;
	}public double sqrRoot(int num) {
		return Math.sqrt(num);
	}public void clearMemory() {
		this.memory=0;
	}
}

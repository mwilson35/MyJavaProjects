/**
 * 
 */
package oop;

/**
 * 
 */
public class BankAccountAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.withdrawel(100);
		
		b1.deposit(50);
		b1.withdrawel(100);
		
		b1.deposit(51);
		b1.withdrawel(100);
		
		BankAccount b2=new BankAccount("123456", 0, "Mick", "M.qubn", "7654321");
		b2.deposit(500);
		System.out.println("Balance is "+b2.getBalance());

	}

}

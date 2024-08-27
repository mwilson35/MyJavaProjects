/**
 * 
 */
package oop;

/**
 * 
 */
public class BankAccount {
		private String number;
		private double balance;
		private String customerName;
		private String email;
		private String phoneNum;
		
		public void deposit(double depositAmount) {
			this.balance+=depositAmount;
			System.out.println("Deposited of "+ depositAmount+ " Made. New balance: "+ this.balance);
			
		}
		/**
		 * @param number
		 * @param balance
		 * @param customerName
		 * @param email
		 * @param phoneNum
		 */
		public BankAccount(String number, double balance, String customerName, String email, String phoneNum) {
			super();
			this.number = number;
			this.balance = balance;
			this.customerName = customerName;
			this.email = email;
			this.phoneNum = phoneNum;
		}
		
		public BankAccount() {
			
		}
		public void withdrawel(double withdrawalAmount) {
			if(balance-withdrawalAmount<0) {
				System.out.println("Insufficient funds");
			}else {
				balance-=withdrawalAmount;
				System.out.println("Withdrawel of " +withdrawalAmount+ " processed. Remaining balance: "+balance);
			}
		}
		
		@Override
		public String toString() {
			return "BankAccount [number=" + number + ", balance=" + balance + ", customerName="
					+ customerName + ", email=" + email + ", phoneNum=" + phoneNum + "]";
		}
		/**
		 * @return the accountNumber
		 */
		public String getnumber() {
			return number;
		}
		/**
		 * @param accountNumber the accountNumber to set
		 */
		public void setnumber(String accountNumber) {
			this.number = accountNumber;
		}
		/**
		 * @return the balance
		 */
		public double getBalance() {
			return balance;
		}
		/**
		 * @param balance the balance to set
		 */
		public void setBalance(double balance) {
			this.balance = balance;
		}
		/**
		 * @return the customerName
		 */
		public String getCustomerName() {
			return customerName;
		}
		/**
		 * @param customerName the customerName to set
		 */
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * @return the phoneNum
		 */
		public String getPhoneNum() {
			return phoneNum;
		}
		/**
		 * @param phoneNum the phoneNum to set
		 */
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		
		

}

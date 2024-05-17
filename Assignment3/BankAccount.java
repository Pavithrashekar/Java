package Q2_Exceptional;


	public class BankAccount {
		public static void main(String[] args) {
			CheckingAcc acc = new CheckingAcc(1000);

			try {
				acc.withdraw(500);
				acc.withdraw(800);
			} catch(InsufficientFundsException e) {
				System.out.println("Exception occured: " + e.getMessage());
			}
		}
	}




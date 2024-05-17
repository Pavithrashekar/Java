package Q2_Exceptional;


	public class CheckingAcc {
		double balance;

		public CheckingAcc(double initialbalance) {
			this.balance = initialbalance;
		}

		void withdraw(double amount) throws InsufficientFundsException {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("Withdrawal successful. Remaining balance: " + balance);

			} else {
				throw new InsufficientFundsException("Insufficint Balance !!\nBalance: " + balance);
			}
		}

		public double getBalance() {
			return balance;
		}

	}



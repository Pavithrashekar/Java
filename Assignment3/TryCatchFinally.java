package Q1_Exceptional;

public class TryCatchFinally {
	
		void execute() {
			try {
				System.out.println("Inside the try block.");
				int result = 10/0;
			} catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero..");
			} finally{
				System.out.println("Inside Final block.\nThis block will always execute.");
			}
		}
	}



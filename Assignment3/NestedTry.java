package Q1_Exceptional;

public class NestedTry {
	
		void execute() {
			try {
				try {
					System.out.println("Inside inner try block.");
					System.out.println("dividing 10 by 0");
					System.out.println();
					int result = 10/0;
				} catch(ArithmeticException e){
					System.out.println("Cannot divide by zero.\nException caught by inner catch block.");
				}
			} catch(Exception e) {
				System.out.println();
				System.out.println("Exception occured.");
				System.out.println("Exception caught by outer catch blkock.");
			}
		}
	}


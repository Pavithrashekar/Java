package Q1_Exceptional;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleCatch {
	
		public void execute(Scanner sc) {
			try {
				System.out.println("Enter 2 numbers: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				int res = divide(num1, num2);
				System.out.println("result = " + res);
			} catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero. Arithmetic Exception.");
			} catch(InputMismatchException e) {
				System.out.println("Please enter valid integers. Input Mismatch Exception caught: ");
			} catch(Exception e) {
				System.out.println("Exception occured : " + e.getMessage());
			}
		}
		
		int divide(int num1, int num2) throws ArithmeticException{	
			if(num2 == 0) {
				throw new ArithmeticException("Division by zero.");
			}
			return num1/num2;
		}
	}



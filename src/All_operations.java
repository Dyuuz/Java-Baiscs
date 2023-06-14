import java.util.Scanner;
public class All_operations {
   private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Welcome to Dyuuz Calculator");
		
//		Getting the user's choice on arithmetic operations
		double num1, num2, num3, choicenum;
		int choice;
	    System.out.println("These are the list of operations you can work with:\n1.Addition\n2.Subtraction\n3.Division"
	   		+ "\n4.Multiplication");
		System.out.print("Input a number on the list to make an operation: ");
		choice = scan.nextInt();
		
//		Leveraging switch statement
		switch (choice) {
		case 1:
			 System.out.println("Here you have to input two random numbers to make an Addition operation");
			 System.out.print("Input first number: ");
			 num1 = scan.nextInt();
			 System.out.print("Input second number: ");
			 num2 = scan.nextInt();
			 num3 = num1 + num2;
//			 Print Result
			 System.out.println("The addition of the numbers equals "+ num3);
			 
		case 2:
			 System.out.println("Here you have to input two random numbers to make a Subtraction operation.");
			 System.out.print("Input first number: ");
			 num1 = scan.nextInt();
			 System.out.print("Input second number: ");
			 num2 = scan.nextInt();
			 System.out.println("How do you want to perform the operation:\nInput '1' to subtract first num from second num"
			 		+ "\nInput '2' to subtract second num from first num");
			 System.out.print("Input choice: ");
			 choicenum = scan.nextInt();
			 
			 if (choicenum == 1) {
				 num3 = num2 - num1;
				 System.out.println("First num subtracted from second number equals "+ num3);
				 break;
				 }
			 else if(choicenum == 2) {
				 num3 = num1 - num2;
				 System.out.println("Second num subtracted from first number equals "+ num3);
				 break;
				 }
			 else {
				 System.out.println("You inputted a wrong choice");
				 break;
			 }
		case 3:	 
			
		case 4:
		}
		
	}

}

import java.util.Scanner;
public class New{
	private static Scanner print;
	public static void main(String [] args) {
	print = new Scanner(System.in);
	System.out.println("Welcome to DApps University");
	
	String name, mail, wallet, twtusr;
	int age;
	
	System.out.print("Input your age: ");
	age = print.nextInt();
	
	
	if (age <= 10) {
		System.out.println("You are still young");
	}
	else if (age <= 20 ) {
		System.out.println("Getting old");
	}
	else if (age >= 30 ) {
		System.out.println("Getting too old");
	}
	else {
		System.out.println("Wrong input");
	}
	System.out.print("Input your name: ");
	name = print.next();
	
	System.out.print("Input your Email address: ");
	mail = print.next();
	
	System.out.print("Input your age: ");
	age = print.nextInt();
	
	System.out.print("Input your wallet: ");
	wallet = print.next();
	
	System.out.print("Input your Twitter Username: ");
	twtusr = print.next();
	
	System.out.println("Here are your info:");
	System.out.println("Your name is: " + name);
	System.out.println("Your mail address is: " + mail);
	System.out.println("Your age is: "+ age);
	System.out.println("Your wallet is: "+ wallet);
	System.out.println("Your twitter user is: " + twtusr);
	System.out.println("Thanks for joining us.");
	
	
	}
}
import java.util.Scanner;
public class Ifelse_stm {
	private static Scanner scan;
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int value1, value2, value3;
		System.out.print("Input your first bank account balance: ");
		value1 = scan.nextInt();
		System.out.print("Input your second bank account balance: ");
		value2 = scan.nextInt();
		value3 = value1 + value2;
		
		if (value3 <= 1000)
		{
			System.out.print("You are damn poor!You really have to work hard!!"
					+ "\nYou can see you have #"+value3+" in your bank account");
		}
		else if(value3 <= 5000)
		{
			System.out.print("You can only have a nice square meal for a day!You need to start doing it differently!!"
					+ "\nYou can see you have #"+value3+" in your bank account");
		}
		else if(value3 <= 20000){
			System.out.print("You can only afford a nice square meal for a week! But you still have to work harder!!"
					+ "\nYou can see you have #"+value3+" in your bank account");
		}
		else
		{
			System.out.print("Still good enough!!Keep expanding!"
					+ "\nYou can see you have #"+value3+" in your bank account");
		}
		
		
	}

}

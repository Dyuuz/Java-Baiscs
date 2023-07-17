import java.util.Scanner;
public class Methods{
	public static Scanner input;
	public static void main(String []args) {
		input = new Scanner(System.in);
		Methods_ext CeObject = new Methods_ext();
		
		System.out.print("Input your name: ");
		String alias =input.nextLine();
		
		String id = "tyuiO98o"; 
		
		CeObject.FirstActivity(alias);
		CeObject.SecondActivity(id);
		CeObject.TActivity(0);
		CeObject.dev();
		
	}
}
import java.util.Scanner;
public class Class_a {
	public static Scanner input;
	public static void main(String []args) {
		input = new Scanner(System.in);
		
		ClassMeths CmObject = new ClassMeths();
		System.out.print("What is your username: ");
		String usr =  input.nextLine();
		CmObject.setName(usr);
		CmObject.declaring();
	}

}

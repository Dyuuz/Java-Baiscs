import java.util.Scanner;
public class test_method {
	private static Scanner fill;
	public static void main(String[]args) {
	
	fill = new Scanner(System.in);
	test tobj = new test();
	System.out.print("What is your position: ");
	String pos =  fill.nextLine();
	tobj.imp(pos);
	tobj.declaring();
	
	}
}

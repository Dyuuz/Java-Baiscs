public class MethodParams {
	static void myMethod(String name, int age) {
		System.out.println(name + " is " + age + " year old.");
	}
	
	static void declare(String name) {
		System.out.print(name + " is testing the method types.");
	}
	
	public static void main(String []args) {
		myMethod("Shaw", 35);
		myMethod("Justin", 48);
		declare("Laycon");
	
	}
}

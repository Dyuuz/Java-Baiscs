interface StringFunction{
	String run(Object str);
}
public class lambda_exp_params {
	public static void main (String []args) {
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
	}

	private static void printFormatted(String string, StringFunction format) {
			Object str = string;
			String result = format.run(str);
			System.out.println(result);
	}
	 
	
}

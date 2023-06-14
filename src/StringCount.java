
public class StringCount {
	public static void main(String []args) {
		String spill = "Trading is a monumental task";
		int count = spill.split("\\s").length;
		System.out.print(count);
	}
}

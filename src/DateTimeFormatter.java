import java.time.LocalDateTime;
public class DateTimeFormatter {
	public static void main(String [] args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("Before Formatting: "+obj);
		
		java.time.format.DateTimeFormatter formatobj = java.time.format.DateTimeFormatter.ofPattern("E, MMM dd yyyy. HH:mm:ss");
		String format = obj.format(formatobj);
		System.out.println("After Formatting: " + format);
	}
}

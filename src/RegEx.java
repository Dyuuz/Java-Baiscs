import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx {
	public static void main (String []args) {
		Pattern pat = Pattern.compile("Lekan|Segun", Pattern.CASE_INSENSITIVE);
		Matcher mat = pat.matcher("LekAN");
		Boolean bool = mat.matches();
		if (bool) {
			System.out.println(bool);
		}
		else {
			System.out.println("Match not found");
		}
	}
	

}

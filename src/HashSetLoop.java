import java.util.HashSet;

public class HashSetLoop {
public static void main(String []args) {
	HashSet<String> android =  new HashSet<String>();
	
	android.add("Infinix");
	android.add("Tecno");
	android.add("Samsung");
	android.add("Redmi");
	android.add("Vivo");
	android.add("Tecno");
	for (String n : android) {
		System.out.println(n);
	}
	}
}

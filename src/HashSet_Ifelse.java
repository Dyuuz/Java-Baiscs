import java.util.HashSet;

public class HashSet_Ifelse {
public static void main(String []args) {
	HashSet<Integer> android =  new HashSet<Integer>();
	                                                                                                                                                                                                                                                     
	android.add(6);
	android.add(2);
	android.add(9);
	android.add(7);
	android.add(5);
	
	for (int i = 0; i <= 10; i++) {
		if (android.contains(i)) {
			System.out.println(i + " is part of the hashset list.");
		}
		else {
				System.out.println(i + " is not part of the hashset list.");
		}
	}
	}
}
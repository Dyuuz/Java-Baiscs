import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String [] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Dyuuz");
		list.add("BahdVec");
		list.add("Wolf");
		list.add("Siri");
		
//	Alphabetical order
		Collections.sort(list);
		
//		Reversed order
		Collections.reverse(list);
		System.out.println(list);
			
	}
}
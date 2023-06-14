import java.util.ArrayList;
import java.util.Iterator;

public class Iterataor {
	public static void main(String []args) {
	ArrayList<String> model = new ArrayList<String>();
	model.add("Apple");
	model.add("Samsung");
	model.add("Redmi");
	model.add("Vivo");
	
	Iterator<String> itr = model.iterator();
	
	
//	print the first item
	System.out.println("First model: "+itr.next());
	
	
	
//	Loop through a collection
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
   }
}

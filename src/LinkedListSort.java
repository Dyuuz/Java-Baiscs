import java.util.LinkedList;
import java.util.Collections;
public class LinkedListSort {
	public static void main(String []main) {
	LinkedList<Integer> numbers = new LinkedList<>();
	numbers.add(10);
	numbers.add(90);
	numbers.add(46);
	numbers.add(31);
	numbers.add(6);
	Collections.sort(numbers);
	System.out.println(numbers);
	
	}
}

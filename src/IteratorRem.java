import java.util.Iterator;
import java.util.ArrayList;

public class IteratorRem {
	public static void main(String [] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(5);
		nums.add(13);
		nums.add(19);
		nums.add(2);
		
		Iterator<Integer> itr = nums.iterator();
		
		while (itr.hasNext()) {
			Integer i = itr.next();
			if(i < 10) {
			itr.remove();
			}
		}
		System.out.print(nums);
	}

}

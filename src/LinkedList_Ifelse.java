import java.util.LinkedList;
public class LinkedList_Ifelse {
	public static void main(String []args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(10);
		
		for (int i = 1; i <= 10; i++) {
			if (list.contains(i)) {
				System.out.println(i + " is on the list.");
			}
			else {
				System.out.println(i + " is not on the list.");
			}
		}
	}
}

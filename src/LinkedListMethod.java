import java.util.LinkedList;
public class LinkedListMethod{
	public static void main(String []main) {
	LinkedList<Integer> numbers = new LinkedList<>();
	numbers.add(10);
	numbers.add(90);
	numbers.add(46);
	numbers.add(31);
	numbers.add(6);
//	Add elements to last index of the linked list
	numbers.addLast(66);
	System.out.println(numbers);
//	Add elements to first index of the linked list
	numbers.addFirst(44);
	System.out.println(numbers);
//	Remove elements of the last index of the linked list
	numbers.removeLast();
	System.out.println(numbers);
//	Remove elements to first index of the linked list
	numbers.removeFirst();
	System.out.println(numbers);
	
	}
}

public class Lambda {
	public static void main(String [] args) {
		
		java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
		list.add(4);
		list.add(8);
		list.add(11);
		list.add(17);
		System.out.println(list);
		list.forEach( (n) -> { System.out.println(n); } );
	}
}

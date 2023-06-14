public class ArrayListLoop {
	public static void main(String [] args) {

		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add("Dyuuz");
		list.add("BahdVec");
		list.add("Wolf");
		list.add("Siri");
//		System.out.println(list);
	
		for (int i = 0 ;i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}
}
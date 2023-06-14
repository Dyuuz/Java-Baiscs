public class ArrayList {
	public static void main(String [] args) {
//		Compiler Settings Modification
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add("Dyuuz");
		list.add("BahdVec");
		list.add("Wolf");
		list.add("Siri");
//		Output ArrayList
		System.out.println(list);
//		Get ArrayList with index
		System.out.println(list.get(3));
//		Modify Array elements
		System.out.println(list.set(0, "Sylvia"));
		System.out.println(list);
//		Remove elements
		System.out.println(list.remove(1));
		System.out.println("Remove Element on index 1: "+list);
//		ArrayList Size
		System.out.println("Array Size: "+list.size());
	}

}

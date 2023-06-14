public class Encapsulation_Main {

	public static void main(String[] args) {
		
		Encapsulation_Obj myObj = new Encapsulation_Obj();
		Encapsulation_Obj2 Obj = new Encapsulation_Obj2();
		
		String name1 = "Laycon";
		String name2 = "Dyuuzz";
		
//		Outputs Encapsulation_Obj class
		myObj.setName(name1);
		myObj.declare();
		
//		Outputs Encapsulation_Obj2 class
		Obj.setName(name2);
	}

}

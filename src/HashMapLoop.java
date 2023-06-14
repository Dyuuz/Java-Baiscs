import java.util.HashMap;
public class HashMapLoop {
	public static void main(String []main) {
		HashMap<String , String> namesSur = new HashMap<String , String>();
		namesSur.put("Adelakun", "Ayomide");
		namesSur.put("Abdulsalam", "Nahimat");
		namesSur.put("Ojo", "Olamide");
		namesSur.put("Akpe", "Esiri");
//		print keys
		System.out.println("Print Keys: ");
		for(String i : namesSur.keySet()) {
			System.out.println(i);
		}
//		print values
		System.out.println("Print Values: ");
			for(String i : namesSur.values()) {
				System.out.println(i);
		}
//		print keys & values
		System.out.println("Print Keys & Values: ");
			for (String n : namesSur.keySet() ) {
				System.out.println("Key: "+ n +" ,Values: "+ namesSur.get(n));
				
			}
			
	}
}

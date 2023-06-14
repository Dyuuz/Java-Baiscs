import java.util.HashMap;
public class HashMapMethods {
	public static void main(String [] args) {
		HashMap<String , String> namesSur = new HashMap<String , String>();
		namesSur.put("Adelakun", "Ayomide");
		namesSur.put("Abdulsalam", "Nahimat");
		namesSur.put("Ojo", "Olamide");
		namesSur.put("Akpe", "Esiri");
//		access a key
		namesSur.get("Olamide");
		System.out.println(namesSur);
//		
	}
}

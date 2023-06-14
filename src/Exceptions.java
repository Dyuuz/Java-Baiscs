
public class Exceptions {
	public static void main(String []args) {
		try {
		int  array[] = {1, 2, 3, 4, 5};
		System.out.println(array[5]);
		}catch (Exception e) {
			System.out.println("Index out of bond.");
		}finally {
			System.out.println("The try catch is finished.");
		}
	}
}


public class Array_in_loop {
	public static void main(String []args) {
		int array[] = {2,14,36,45,67,89};
		System.out.println("Index\tValue");
		
		for (int cont=0; cont < array.length; cont++) {
			System.out.println(cont + "\t" + array[cont] );
		}
	}

}

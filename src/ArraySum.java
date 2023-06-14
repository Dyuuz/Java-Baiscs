
public class ArraySum {
	public static void main(String []args) {
		int array[]= {8, 17,31,49,67,99};
		int sum = 0;
		
		for (int cont = 0; cont<array.length; cont++) {
			sum += array[cont];
		}
		System.out.println("Array sum is "+ sum);
	}

}

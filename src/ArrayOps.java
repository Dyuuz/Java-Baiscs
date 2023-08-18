import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayOps {
	public static Scanner Scan;
	public static void main(String[] args) {
		Scan = new Scanner(System.in);
		Random value = new Random();
//		Creating array using ArrayList import
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Array.add(1+value.nextInt(1000));
		Array.add(1+value.nextInt(1000));
		Array.add(1+value.nextInt(1000));
		Array.add(1+value.nextInt(1000));
		Array.add(1+value.nextInt(1000));
		Array.add(1+value.nextInt(1000));
		System.out.println("Result of Array");
		System.out.println(Array);
		Collections.sort(Array);
		System.out.println("Sorted result of Array");
		System.out.println(Array);
		
//		Regular method of creating Arrays
		int Array1[] = new int[7];
		System.out.print("ArrayIndex\tValue\n");
		
		for(int i=0; i<Array1.length;i++ ) {
			Array1[i] = 1+value.nextInt(1000);
			System.out.print(i + "\t\t"  +Array1[i]+"\n");
		}
		
//		Search an array with its value
		for(int i=0; i<Array1.length;i++ ) {
			if(Array1[i]== Array1[4]) {
				System.out.println("Element "+Array1[4]+" was found at index "+ i );
			}
		}
		
	}

}

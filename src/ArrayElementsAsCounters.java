import java.util.Random;
public class ArrayElementsAsCounters {
	public static void main(String[]args) {
		
		Random rand = new Random();
		int array[] = new int[7];
		
		for (int freq = 1; freq<500 ; freq++) {
			++array[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for (int face = 1; face<array.length; face++) {
			System.out.println(face+ "\t" + array[face]);
		}
			
		
	}

}
  
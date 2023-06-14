import java.util.Random;
public class ArrayRandomIndexValues {

	public static void main(String[] args) {
		Random Rand = new Random(); 
		int array[] = new int[5];
		array[0] = 1+Rand.nextInt(10,20);
		array[1] = 1+Rand.nextInt(20,30);
		array[2] = 1+Rand.nextInt(30,40);
		array[3] = 1+Rand.nextInt(40,50);
		array[4] = 1+Rand.nextInt(50,60);
		
		System.out.println("index   Scores");
		int total = 0;
		for (int cont=0; cont <array.length; cont++) {
			
			System.out.println(cont + "\t" + array[cont]);
			total += array[cont];
		}
		int result = total;
		System.out.println("Sum of Arrays= " + result);
	}

}

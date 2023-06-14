import java.util.Random;
public class Random_nums {

	public static void main(String[] args) {
		Random dice = new Random();
		int num;
		System.out.println("No\tRandom value");
		
		for (int cnt = 1; cnt <= 10; cnt+=1) {
			num = 1+dice.nextInt(10);
			System.out.println(cnt + "\t"+ num);
		}

	}

}

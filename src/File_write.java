import java.io.FileWriter;
import java.io.IOException;

public class File_write {
	public static void main(String []args) {
		try {
		FileWriter write = new FileWriter("C:\\Dyuuz\\Notes\\filename.txt");
		String Para1 = "The quote entails the major importance of resilience regardless of one's result "
				+ "on consistent hardwork.\n";
		String Para2 = "Everyday every and day of life, hardwork always payoff compared to just settling "
				+ "for less beacause of a mindblowing\n";
		String Para3 = "results resulting from a trivial task. These positions can easily get offtrack due "
				+ "to foundational backgrounds and failure";
		write.write(Para1+Para2+Para3);
		write.close();
		System.out.println("Successully wrote to the file, ");
		}
		catch(IOException e) {
			System.out.print("An error occured!");
		}
	}
}

import java.io.FileWriter;
import java.io.IOException;

public class File_write {
	public static void main(String []args) {
		try {
		FileWriter write = new FileWriter("C:\\Dyuuz\\Notes\\filename.txt");
		write.write("Files in Java might be tricky, but it is fun enough");
		write.close();
		System.out.println("Successully wrote to the file, ");
		}
		catch(IOException e) {
			System.out.print("An error occured!");
		}
	}
}

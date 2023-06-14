import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_Read { 
	public static void main(String []args) {
	try {
		File read = new File("C:\\Dyuuz\\Notes\\filename.txt");
		try (Scanner scan = new Scanner(read)) {
			while(scan.hasNextLine()) {
				String data = scan.nextLine();
				System.out.println(data);
			}
		}
		
	}catch (IOException e) {
		System.out.println();
		e.printStackTrace();

	}
	
	}
}

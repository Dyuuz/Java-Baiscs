import java.io.File;
import java.io.IOException;

public class File_create2 {
	private static boolean res;
	public static void main(String []args) {
	File file = new File("C:\\Dyuuz\\Notes\\Java.txt");
	try {
		res = file.createNewFile();
		if (res) {
				System.out.println("Java text file created.");
				System.out.println("Filename: "+ file.getName());
				System.out.println("Absolute path: "+ file.getAbsolutePath());
				System.out.println("Executable: "+ file.canExecute());
				System.out.println("Writeable: "+ file.canWrite());
				System.out.println("Readable: "+ file.canRead());
				System.out.println("File size in byte: "+ file.length());
				System.out.println("Parent file: "+ file.getParentFile());
		}else {
			System.out.println("File already exists.");
		}
		
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
}

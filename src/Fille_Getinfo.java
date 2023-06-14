import java.io.File;

public class Fille_Getinfo {
	private static boolean result;
	public static void main (String []args) {
		File myObj = new File("C:\\Dyuuz\\Notes\\filename.txt");
		result = myObj.exists();
		if (result) {
			System.out.println("Filename: "+ myObj.getName());
			System.out.println("Absolute path: "+ myObj.getAbsolutePath());
			System.out.println("Executable: "+ myObj.canExecute());
			System.out.println("Writeable: "+ myObj.canWrite());
			System.out.println("Readable: "+ myObj.canRead());
			System.out.println("File size in byte: "+ myObj.length());
			System.out.println("Parent file: "+ myObj.getParentFile());
		}else {
			System.out.println("File does not exist.");
		}
		
	}
}

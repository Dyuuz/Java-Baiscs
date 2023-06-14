import java.io.File;

public class File_DeleteFolder{
	public static void main(String []args) {
		File obj = new File("C:\\Dyuuz\\Notes");
		if (obj.delete()) {
			System.out.println("Deleted the file: " +obj.getName());
		}
		else {
			System.out.println("Failed to delete the folder");
		}
	}
}

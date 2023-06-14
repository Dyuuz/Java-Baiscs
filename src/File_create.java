import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class File_create {
  private static boolean result;

public static void main(String[] args) {
    
      File myObj = new File("C:\\Dyuuz\\Notes\\filename.txt");
      
      try {
    	  result = myObj.createNewFile();
        System.out.println(result? "File Created: " + myObj.getName(): "File already exists");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
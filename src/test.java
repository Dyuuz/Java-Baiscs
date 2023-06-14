public class test{
	 private String first;
	 public void imp(String Second) {
		 first = Second;
	 }
	 public String ex() {
		 return first;
	 }
	 public void declaring() {
		 System.out.printf("Your position is %s\n", ex());
		 System.out.printf("Your position is %s", first);
	 }
	 
}
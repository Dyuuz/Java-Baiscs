abstract class Abstract {
	public String name = "Laycon";
	public String skills = "trading";
	public int profit = 1367;
	public abstract void print();
}

 class Page extends Abstract{
	 public int frequency = 3;
	 public void print() {
		 System.out.println("Thrive!! You are almost there!");
	 }
 }

 
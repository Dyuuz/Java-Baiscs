public class Constructor_W3{
	public String gf;
	public Constructor_W3(String bf) {
		gf = bf;
	}
	
	public static void main(String []args) {
		Constructor_W3 myObj = new Constructor_W3("Ay & Toyosi");
		System.out.print("The couple are " + myObj.gf);
	}
	
	
}
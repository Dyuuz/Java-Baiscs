public class InnerClassDefaultMain {
	
	InnerClassDefault firstobj = new InnerClassDefault();
	InnerClassDefault.IC secondobj = firstobj.new IC();
	
	System.out.println(firstobj.z + secondobj.y );
	
}
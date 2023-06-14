
public class Constructor {
	
	public static void main(String[]args) {
		
		String one = "Shawn";
		Const_Meths CmObject = new Const_Meths(one);
		Const_Meths CmObject2 = new Const_Meths("Gomez");
		Const_Meths CmObject3 = new Const_Meths("Dej Loaf");
		
		CmObject.declare();
		CmObject2.declare();
		CmObject3.declare();
	}

}

class InClassStatic {
	int x = 11;
static class InClass{
		int y = 22;
	}
}
public class Main{
	public static void main(){
		InClassStatic firstobj =  new InClassStatic();
		InClassStatic.Inclass secondObj = new InClassStatic.Inclass();
		System.out.println(secondObj.y);
	}
}

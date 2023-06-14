
public class Wrapper_class {
	public static void main(String []args) {
//		First Block
		{
		Integer myInt = 12;
		Double doub = 7.847;
		Character ch = 'C';
		
//		Print direct variable names
		System.out.println(myInt);
		System.out.println(doub);
		System.out.println(ch);
		}
		
//		Second Block
		{
		Integer num = 134;
		String str = num.toString();
//		Conversion of integer to string
		System.out.println(str);
		System.out.println(str.length());
		}
		
//		Third Block
		{
		Integer myIntt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
//		Alternative printing methods for wrapper class
		System.out.println(myIntt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
		}
	}

}

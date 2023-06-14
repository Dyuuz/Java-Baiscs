public class EnumLoop {
	enum Position{
		FIRST,
		SECOND,
		THIRD,
		FOURTH
	}
	public static void main(String []args) {
		for (Position object: Position.values()){
			System.out.println(object);
		}
	}
}

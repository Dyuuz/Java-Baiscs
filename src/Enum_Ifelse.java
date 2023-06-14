
public class Enum_Ifelse {
	enum Position{
		FIRST,
		SECOND,
		THIRD,
		FOURTH;

		boolean contains(String pos) {
			return false;
		}
	}
	public static void main(String [] args) {
		
		Position obj = Position.FIRST;
		String pos = "FIFTH";
		if (obj.contains(pos)){
			System.out.println("You made it to the first position");
		}
		else {
			System.out.println("You didn't make it to the top student list.");
		}
	}
}

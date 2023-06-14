public class EnumSwitch {
	enum Position{
		FIRST,
		SECOND,
		THIRD,
		FOURTH
	}
	public static void main(String [] args) {
		Position obj = Position.FIRST;
		switch (obj) {
		case FIRST:
			System.out.println("You made to the first position");
			break;
		case SECOND:
		System.out.println("You made to the second position");
			break;
		case THIRD:
			System.out.println("You made to the third position");
			break;
		case FOURTH:
			System.out.println("You made to the fourth position");
			break;
		}
	}

}

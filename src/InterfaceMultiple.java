interface InterfaceMultiple {
	public void first();
}
interface InterfaceMultiple2{
	public void second();
}

class subClass implements InterfaceMultiple, InterfaceMultiple2{
	public void first() {
		System.out.println("Welcome to the first interface.");
	}
	public void second() {
		System.out.println("Welcome to the second interface.");
	}
}
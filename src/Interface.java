interface  Super{
	public void method();
}
class Sub implements Super{
	public void method() {
		System.out.println("This is an interface class");
	}
}

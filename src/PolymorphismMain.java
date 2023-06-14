class PolymorphismMain{
	public static void main(String[]args) {
//	Variable declaration
		String name = "poohh";
//	Object declaration
		Polymorphism Pobj = new Polymorphism();
		Dog PigObj = new Dog();
		Pig DogObj = new Pig();
		Rabbit RabObj = new Rabbit();
		
//		Method declaration
		Pobj.animalSound(name);
		PigObj.animalSound();
		DogObj.animalSound();
		RabObj.animalSound();
		
	}
}
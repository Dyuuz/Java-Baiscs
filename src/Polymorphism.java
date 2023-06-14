class Polymorphism {
	 public void animalSound(String nam) {
		 System.out.println("Animal makes a sound, " + nam +"!!");
	 }
}
class Pig extends Polymorphism{
	public void animalSound() {
		System.out.println("The pig sounds like wee wee");
	}
}
class Dog extends Polymorphism{
	public void animalSound() {
		System.out.println("The pig sounds like bow wow");
	}
}
class Rabbit extends Polymorphism{
	public void animalSound() {
		System.out.println("The rabbit sounds like skrrr skrrrrr");
	}
}

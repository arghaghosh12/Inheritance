package hybridinheritance;

class Dog  extends Animal implements Pet{
	public void play()
	{
		System.out.println("Dog loves to play");
	}
	void bark()
	{
		System.out.println("Dog barking");
	}

}
class Cat extends Animal implements Pet
{
	public void play()
	{
		System.out.println("Cat play..");
	}
	void meow()
	{
		System.out.println("Cat meows..");
	}
}
class HbdInheritance
{
	public static void main(String[] args) {
		Cat c=new Cat();
		c.play();
		c.meow();
		c.eat();
	}
}

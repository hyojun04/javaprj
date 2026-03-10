package interface_7;

public class ZooExample {

	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		Cat cat = new Cat();
		Dog dog = new Dog();
		PetDog petdog = new PetDog();
		PetCat petcat = new PetCat();
		
		tiger.eat();
		cat.eat();
		dog.eat();
		petdog.eat();
		petcat.eat();
		
		
		
		
		
		
	}

}

//인터페이스
interface Animal{
	void eat();
	void sleep();
}

interface Pet{
	void follow();
}

//추상클래스
abstract class Feline implements Animal{
	abstract void makeSound();
}

//클래스들


class Tiger extends Feline{
	@Override
	public void eat() {
		System.out.println("Tiger is eating...");
	}
	
	@Override
	public void sleep() {
		System.out.println("Tiger is sleeping...");
	}
	
	@Override
	void makeSound() {
		System.out.println("Tiger is roaring...");
	}
}
class Cat extends Feline{
	@Override
	public void eat() {
		System.out.println("Cat is eating...");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat is sleeping...");
	}
	
	@Override
	void makeSound() {
		System.out.println("Cat is roaring...");
	}
}
class Dog implements Animal{
	public void eat() {
		System.out.println("Dog is eating...");
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping...");
	}
	
	public void jump() {
		System.out.println("Dog is jumping");
	}
}

class PetDog extends Dog implements Pet{
	public void follow() {
		System.out.println("PetDog is following...");
	}
}

class PetCat extends Cat implements Pet{
	public void follow() {
		System.out.println("PetCat is following...");
	}
}
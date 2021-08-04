package inheritance;

class Animal{
	public void move() {
		System.out.println("Animals move");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("Human walks with two legs");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("Tigers run with four legs");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("Eagles fly");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		//이렇게 표현도 되고
		//Animal animal = new Human();
		//이런식으로도 되고
		//이처럼 다양하게 표현할 수 있다는 점이 다형성이다
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}

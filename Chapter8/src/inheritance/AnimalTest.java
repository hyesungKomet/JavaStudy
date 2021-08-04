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
		//�̷��� ǥ���� �ǰ�
		//Animal animal = new Human();
		//�̷������ε� �ǰ�
		//��ó�� �پ��ϰ� ǥ���� �� �ִٴ� ���� �������̴�
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}

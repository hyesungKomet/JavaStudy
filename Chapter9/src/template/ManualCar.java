package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들을 조작합니다");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크로 정지합니다");
		
	}
	
	//public void run() {}
	//이처럼 final의 경우 상속받은 하위 클래스에서 재정의 또는
	//오버라이딩을 할 수 없게 된다
	
	@Override
	public void wiper() {
		System.out.println("사람이 수동으로 조절합니다");
	}
	
	
}

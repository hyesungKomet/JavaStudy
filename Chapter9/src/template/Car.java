package template;
//final 예약어
// 값이 변경될 수 없다
// 한 번만 할당이 가능하며 오버라이딩 불가능
// final class는 더 상속될 수 없다
//	ex) String 클래스
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {}; //구현한 건데 코드가 없음
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	//run()이라는 시나리오는 바뀌면 안된다
	//그렇기에 final로  선언한다
	public final void run() {
		startCar();
		drive();
		wiper();
		//wiper의 구현이 하위 클래스에서 필요함(추상 메소드로 선언했기에)
		//그래서 하위 클래스에서 코드를 추가하지 않으면 에러 발생
		stop();
		washCar();
		//washCar경우는 구현코드가 없는게 아님!
		//따로 하위 클래스에서 추가 구현할 필요 X
		//필요 없으면 구현하지 않도록 할 때 사용하는 방식
		//"필요에 의한 재정의"
		//템플릿 메서드: 추상 메서드나 구현된 메서드를 활용하여 
		//전체 기능의 흐름(시나리오)을 정의하는 메서드
		//final으로 통해 재정의 막도록도 함
		//프레임 워크에서 많이 사용됨
		turnOff();
	}
}

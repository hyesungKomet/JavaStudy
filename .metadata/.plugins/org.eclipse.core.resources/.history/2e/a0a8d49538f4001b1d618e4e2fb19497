package abstractex;

//abstract class는 당장의 클래스에서 필요한 메서드가 아니라
//다른 클래스에서 이 클래스를 상속했을 때 구체적으로 구현하고 싶을 경우 쓴다
//하위 클래스 입장에서는 추상 메서드의 구현에 대한 책임이 있다
//상위 클래스 입장에서는 추상 메서드에 대한 구현을 위임한다
public abstract class Computer {
	//abstract 메소드를 사용할 때에는 abstarct class로 선언해야 함
	
	public abstract void display();
	//이처럼 메소드 끝에 ;을 붙이면 바디가 없고 선언만 하겠다는 의미
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}

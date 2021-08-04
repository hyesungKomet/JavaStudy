//인터페이스: 모든 메서드가 추상 메서드인 클래스

//형식적 선언만 있고 구현 없다
//모든 메서드는 public abstract
//모든 변수는 public static final

//인터페이스 구현은 설계 과정의 중요한 부분임
//이 스켈레톤을 바탕으로 구체적 코드를 작성한다

//Calc 인터페이스를 Calculator 클래스에서 구현
//이 때 모든 메서드 구현이 이루어지진 않아서 추상클래스가 됨
//CompleteCalc 클래스가 Calculator 상속받아서 모든 메서드 구현

// interface implements: 타입 상속
// class extends : 구현 상속

// ##인터페이스 구현과 형 변환
// 클래스 상속과 달리 구현코드가 없기에 여러 인터페이스 구현 가능
// 형 변환시 사용가능한 메서드는 인터페이스에 선언된 메서드만

//다중상속은 안되지만 인터페이스는 여러개 가능
//ex) customer가 Sell, Buy라는 두개의 인터페이스 모두
//implement가능하다

//인터페이스 상속
//여러 인터페이스 상속 가능
//이는 형 상속이라고함(구현 코드의 상속이 아니기에)

//클래스 상속, 인터페이스 구현을 둘 다 하고 싶은 경우
//public class BookShelf extends Shelf implements Queue{}
//와 같이 클래스 먼저로 한다
//실제 프레임워크(스프링, 안드로이드 등)를 가져다 쓸 때 이런 경우가 꽤 있다


package interfaceex;
//원래는 abstract class, abstract method로 
//해야 하는데 interface로 하면 다 생략 가능해진다
public interface Calc {
	double PI = 3.14;
	// == public static final double
	int ERROR = -99999999;
	//이태릭체로 되어있으면 저게 생략된 것이다
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//디폴트 메서드
	default void description() {
		System.out.println("정수 계산기를 구현한다");
	}
	//static 메서드
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		return total;
	}
}

//Clone: 객체의 원본 복제하는데 쓰이는 메서드
//객체의 정보(멤버변수 값) 등의 인스턴스가 또 생성됨
//따라서 정보은닉, 객체보호 관점에 위배됨
//clone()메서드 사용위해서는 cloneable 인터페이스 명시해야 함!!


package object;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x+","+"y="+y;
	}
}

//cloneable implements 꼭 구현해주어야함
//이래야 clone가능함을 알려줌
class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 "+this.point+"이고, 반지름은 "+radius+"입니다";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class ObjectCloneTest {
	//클론이 안될 때 - 예외처리?같은거
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		//강제 다운캐스팅 - Object이 반환형이어서
		Circle cloneCircle = (Circle)circle.clone();
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
	
		System.out.println(circle);
		System.out.println(cloneCircle);
	}
}

package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// year = year; 이렇게 쓰면 둘다 지역변수인 setYear의 인수 의미 - 의미업쓰
		this.year = year; // 이렇게 해야 멤버변수 의미(파랑)
	}
	
	public void printThis() {
		System.out.println(this); //this가 뭘까용
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		System.out.println(b1);
		b1.printThis();	//b1의 주소를 this가 가르킴을 알 수 이따
		
		Birthday b2 = new Birthday();
		System.out.println(b2);
		b2.printThis(); //다른 인스턴스는 다른 주소 가르킴(b1과 b2의 주소 다름)

	}

}

//Class 클래스
//자바의 모든 클래스, 인터페이스는 컴파일 후 class 파일로 생성됨
//class 파일에는 객체정보(멤버변수, 메서드, 생성자)등 포함
//Class 클래스는 컴파일된 class 파일에서 객체의 정보 가져올 수 있음

//###Class.forName("클래스이름"); 메서드 중요!!!###
//동적로딩: 컴파일시 자료형이 로딩되는게 아니라 실행 중에 데이터타입을 알고
//binding되는 방식
//프로그래밍 시 어떤 클래스 사용할 지 모를 때 변수로 처리하고
//실행될 때 해당 변수에 대입된 값의 클래스가 실행될 수 있도록
//Class 클래스에서 제공하는 static 메서드
//런타임에 로딩돼서 다른 클래스도 사용가능 - 유용!
//ClassNotFoundException 발생가능성 - throws 해주기!

package classex;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException{
		
		Person person = new Person();
		
		//getClass()를 통해서 Class 클래스를 받을 수 있다
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		//classex.Person
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		
		//괄호 안의 이름의 클래스가 있으면 그걸 로딩해준다
		//runtime에 결정된다 - 없으면 에러 발생
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
	}
}

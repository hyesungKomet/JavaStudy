package thisex;

class Person{
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1); // 이런 식으로 다른 생성자를 생성자에서 불러서 쓸 수 있다
		//주의!!! 다른 생성자 쓸 때에는 반드시 다른 변수 선언이 먼저 있어서는 안된다
		//다른 생성자 호출이 가장 먼저 이루어져야함(이유는 강의에서 이해 잘 안됨)
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);	//이름없음
		System.out.println(p1.returnSelf()); //자기자신
		

	}

}

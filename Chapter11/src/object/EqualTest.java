//java.lang 패키지
//프로그래밍시 import 자동으로 됨
//String, Integer, System 등
//jdk-10.0.1 \ lib \ src \ java base \ java \ lang
//에 클래스들 있다

//Object 클래스
//모든 클래스의 최상위 클래스
//extends Object를 컴파일러가 추가해준다
//모든 클래스는 Object클래스를 상속받고 Object의 메서드 사용, 재정의가능
//모든 클래스는 Object클래스로 형변환 가능

// equals 메서드: 두 인스턴스 주소 값 비교하여 true false 반환


package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	//equals 재정의! 논리적 동일성 따지기 위해서
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
	//hashcode 재정의 - studentID를 반환하도록
	//이를 통해 hashcode재정의해서
	//논리적으로 동일하다면 해시코드도 동일값 반환하도록 할 수 있다!!
	public int hashcode() {
		return studentID;
	}
	
}

public class EqualTest {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		//힙 메모리 주소가 다르기에 false나옴
		System.out.println(str1 == str2);
		//문자열이 같은지를 따짐(물리적 동일이 아니라 논리적 동일)
		System.out.println(str1.equals(str2));
		
		Student std1 = new Student(10001, "James");
		Student std2 = new Student(10001, "James");
		
		System.out.println(std1 == std2);
		//이것도 false 나온다 --> equals 재정의하기!
		//재정의하면 true로 됨!
		System.out.println(std1.equals(std2));
		
		//해쉬코드 - 힙메모리의 주소 반환(10진수로)
		//둘의 결과 다름
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		//이건 같다
		//해쉬코드 메소드가 재정의되었기 때문!!
		//논리적으로 같은(equals가 true를 반환하는)
		//두 인스턴스는 해시코드 메서드도 재정의하여 동일값 반환하도록 함
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//재정의된 애들의 Wls 해시코드 궁금하면 아래의 코드 사용
		//--> 다름!!
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}

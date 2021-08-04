//한번 생성된 String값은 immutable(불변)이다
//String에 가보면 final로 선언된다 --> 바뀔 수 없다!!

package string;

public class StringTest {
	public static void main(String[] args) {
		//방법1: 생성자의 매개변수로 문자열 생성
		String str1 = new String("abc");
		String str2 = new String("abc");
		//힙메모리 주소가 다름!
		System.out.println(str1 == str2);
		
		//방법2: 문자열 상수를 가르키는 방식
		String str3 = "abc";
		String str4 = "abc";
		//"abc"라는 문자열 상수가 이미 생성되고 
		//이를 str3, str4가 가르키기에 같게 출력됨!
		System.out.println(str3 == str4);
		
		String str5 = new String("java");
		String str6 = new String("android");
		
		//이건 두 개가 붙은게 아님
		//새로운 메모리가 생성되고 거기에 javaandroid가 들어간다
		//그리고 str5가 새로운"javaandroid"를 가르킨다!
		System.out.println(System.identityHashCode(str5));
		str5 = str5.concat(str6);
		System.out.println(str5);
		
//비교해보면 concat하기 전과 후가 가르키는 메모리 주소가 다름을
//알 수 있다!

// => 따라서 계속 이어붙이면 메모리에 garbage 많아짐
//=> StringBuilder, StringBuffer 사용하기!
//이는 내부적으로 "가변"적인 char[] 배열 가지는 클래스이다
//StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화 보장해줌
//동기화란 멀티 쓰레드에서 쓰레드 간의 순서를 보장하는 것
//단일 쓰레드에서는 StringBuilder 사용 권장!!
//String클래스는 아니기에 toString()으로 후에 변환해주기!
		System.out.println(System.identityHashCode(str5));
	}
}

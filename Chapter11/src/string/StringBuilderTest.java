//Wrapper 클래스: 기본 자료형에 대한 클래스
//Boolean, Byte, Character, Short, Integer, Long, Float, Double

//Autoboxing과 Unboxing
//Integer은 객체, int는 4byte 기본 자료형이기에
//두 자료 연산시 자동 변환이 이루어짐
//과거에는 오토박싱, 언박싱으로 변환해주었다
//Integer i = new Integer(100);대신에[
//Integer i = 100; 도 가능
package string;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		//StringBuilder은
		//가변적인 문자열이기에 추가해도 같은 메모리 가르킴을 알 수 있다!
		System.out.println(System.identityHashCode(buffer));
		
		String str2 = buffer.toString();
		System.out.println(str2);
	}
}

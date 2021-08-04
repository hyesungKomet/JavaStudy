//Wrapper Ŭ����: �⺻ �ڷ����� ���� Ŭ����
//Boolean, Byte, Character, Short, Integer, Long, Float, Double

//Autoboxing�� Unboxing
//Integer�� ��ü, int�� 4byte �⺻ �ڷ����̱⿡
//�� �ڷ� ����� �ڵ� ��ȯ�� �̷����
//���ſ��� ����ڽ�, ��ڽ����� ��ȯ���־���
//Integer i = new Integer(100);��ſ�[
//Integer i = 100; �� ����
package string;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		//StringBuilder��
		//�������� ���ڿ��̱⿡ �߰��ص� ���� �޸� ����Ŵ�� �� �� �ִ�!
		System.out.println(System.identityHashCode(buffer));
		
		String str2 = buffer.toString();
		System.out.println(str2);
	}
}

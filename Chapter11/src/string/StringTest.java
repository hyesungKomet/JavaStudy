//�ѹ� ������ String���� immutable(�Һ�)�̴�
//String�� ������ final�� ����ȴ� --> �ٲ� �� ����!!

package string;

public class StringTest {
	public static void main(String[] args) {
		//���1: �������� �Ű������� ���ڿ� ����
		String str1 = new String("abc");
		String str2 = new String("abc");
		//���޸� �ּҰ� �ٸ�!
		System.out.println(str1 == str2);
		
		//���2: ���ڿ� ����� ����Ű�� ���
		String str3 = "abc";
		String str4 = "abc";
		//"abc"��� ���ڿ� ����� �̹� �����ǰ� 
		//�̸� str3, str4�� ����Ű�⿡ ���� ��µ�!
		System.out.println(str3 == str4);
		
		String str5 = new String("java");
		String str6 = new String("android");
		
		//�̰� �� ���� ������ �ƴ�
		//���ο� �޸𸮰� �����ǰ� �ű⿡ javaandroid�� ����
		//�׸��� str5�� ���ο�"javaandroid"�� ����Ų��!
		System.out.println(System.identityHashCode(str5));
		str5 = str5.concat(str6);
		System.out.println(str5);
		
//���غ��� concat�ϱ� ���� �İ� ����Ű�� �޸� �ּҰ� �ٸ���
//�� �� �ִ�!

// => ���� ��� �̾���̸� �޸𸮿� garbage ������
//=> StringBuilder, StringBuffer ����ϱ�!
//�̴� ���������� "����"���� char[] �迭 ������ Ŭ�����̴�
//StringBuffer�� ��Ƽ ������ ���α׷��ֿ��� ����ȭ ��������
//����ȭ�� ��Ƽ �����忡�� ������ ���� ������ �����ϴ� ��
//���� �����忡���� StringBuilder ��� ����!!
//StringŬ������ �ƴϱ⿡ toString()���� �Ŀ� ��ȯ���ֱ�!
		System.out.println(System.identityHashCode(str5));
	}
}

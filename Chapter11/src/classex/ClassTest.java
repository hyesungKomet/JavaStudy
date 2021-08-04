//Class Ŭ����
//�ڹ��� ��� Ŭ����, �������̽��� ������ �� class ���Ϸ� ������
//class ���Ͽ��� ��ü����(�������, �޼���, ������)�� ����
//Class Ŭ������ �����ϵ� class ���Ͽ��� ��ü�� ���� ������ �� ����

//###Class.forName("Ŭ�����̸�"); �޼��� �߿�!!!###
//�����ε�: �����Ͻ� �ڷ����� �ε��Ǵ°� �ƴ϶� ���� �߿� ������Ÿ���� �˰�
//binding�Ǵ� ���
//���α׷��� �� � Ŭ���� ����� �� �� �� ������ ó���ϰ�
//����� �� �ش� ������ ���Ե� ���� Ŭ������ ����� �� �ֵ���
//Class Ŭ�������� �����ϴ� static �޼���
//��Ÿ�ӿ� �ε��ż� �ٸ� Ŭ������ ��밡�� - ����!
//ClassNotFoundException �߻����ɼ� - throws ���ֱ�!

package classex;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException{
		
		Person person = new Person();
		
		//getClass()�� ���ؼ� Class Ŭ������ ���� �� �ִ�
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		//classex.Person
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		
		//��ȣ ���� �̸��� Ŭ������ ������ �װ� �ε����ش�
		//runtime�� �����ȴ� - ������ ���� �߻�
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
	}
}

package thisex;

class Person{
	String name;
	int age;
	
	public Person() {
		this("�̸�����", 1); // �̷� ������ �ٸ� �����ڸ� �����ڿ��� �ҷ��� �� �� �ִ�
		//����!!! �ٸ� ������ �� ������ �ݵ�� �ٸ� ���� ������ ���� �־�� �ȵȴ�
		//�ٸ� ������ ȣ���� ���� ���� �̷��������(������ ���ǿ��� ���� �� �ȵ�)
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
		System.out.println(p1.name);	//�̸�����
		System.out.println(p1.returnSelf()); //�ڱ��ڽ�
		

	}

}

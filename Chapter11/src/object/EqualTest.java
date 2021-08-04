//java.lang ��Ű��
//���α׷��ֽ� import �ڵ����� ��
//String, Integer, System ��
//jdk-10.0.1 \ lib \ src \ java base \ java \ lang
//�� Ŭ������ �ִ�

//Object Ŭ����
//��� Ŭ������ �ֻ��� Ŭ����
//extends Object�� �����Ϸ��� �߰����ش�
//��� Ŭ������ ObjectŬ������ ��ӹް� Object�� �޼��� ���, �����ǰ���
//��� Ŭ������ ObjectŬ������ ����ȯ ����

// equals �޼���: �� �ν��Ͻ� �ּ� �� ���Ͽ� true false ��ȯ


package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	//equals ������! ������ ���ϼ� ������ ���ؼ�
	
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
	//hashcode ������ - studentID�� ��ȯ�ϵ���
	//�̸� ���� hashcode�������ؼ�
	//���������� �����ϴٸ� �ؽ��ڵ嵵 ���ϰ� ��ȯ�ϵ��� �� �� �ִ�!!
	public int hashcode() {
		return studentID;
	}
	
}

public class EqualTest {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		//�� �޸� �ּҰ� �ٸ��⿡ false����
		System.out.println(str1 == str2);
		//���ڿ��� �������� ����(������ ������ �ƴ϶� ������ ����)
		System.out.println(str1.equals(str2));
		
		Student std1 = new Student(10001, "James");
		Student std2 = new Student(10001, "James");
		
		System.out.println(std1 == std2);
		//�̰͵� false ���´� --> equals �������ϱ�!
		//�������ϸ� true�� ��!
		System.out.println(std1.equals(std2));
		
		//�ؽ��ڵ� - ���޸��� �ּ� ��ȯ(10������)
		//���� ��� �ٸ�
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		//�̰� ����
		//�ؽ��ڵ� �޼ҵ尡 �����ǵǾ��� ����!!
		//���������� ����(equals�� true�� ��ȯ�ϴ�)
		//�� �ν��Ͻ��� �ؽ��ڵ� �޼��嵵 �������Ͽ� ���ϰ� ��ȯ�ϵ��� ��
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//�����ǵ� �ֵ��� Wls �ؽ��ڵ� �ñ��ϸ� �Ʒ��� �ڵ� ���
		//--> �ٸ�!!
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
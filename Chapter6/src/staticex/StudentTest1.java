package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); //10001
		
		Student studentT = new Student();
		System.out.println(studentT.studentID); //10002
		
		System.out.println(studentJ.getSerialNum()); //�� ���� �����Ǵ� static ������
		System.out.println(studentT.getSerialNum()); //���� ���� ����ִ�
		//�̷������� �Ⱦ���(�ν��Ͻ� ������ �ƴ϶� Ŭ���� ����.static���� ����)
		//Student.serialNum����.
		//�ν��Ͻ� ���� ���ص� serial�� ��µ�
	}

}

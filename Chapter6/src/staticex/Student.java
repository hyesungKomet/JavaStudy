package staticex;

public class Student {
	int studentID;
	String studentName;
	
	private static int serialNum = 10000;//���� ������ ���� private
	
	public Student() {
		serialNum++; //�����Ǹ鼭 ������
		studentID = serialNum; //����X �� �ν��Ͻ����� �ٸ��� ��
	}
	
	public static int getSerialNum() {// getter�� ���(setter�� �ƿ� ���X)
		int i = 10; //��ó�� ���������� �����ϴ� ���� ����
		//but!!!!!!!!!!
		//StudentName = "Comet"; //��ó�� static method�ȿ��� �ν��Ͻ� ���� ������ �Ұ���
		// static �޼ҵ�� �ν��Ͻ� ������ ���ο��� �������� �ʰ�
		//Student.getSerialNum���� ����� �� �ִµ�, �� ��쿡�� ��������� ����
		//�ν��Ͻ� ������ studentName�� ȣ��Ȱű⿡ ���� �߻�!!!
		
		
		return serialNum;
	}
}

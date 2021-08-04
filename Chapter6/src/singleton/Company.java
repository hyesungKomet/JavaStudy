package singleton;

public class Company {
	
	private static Company instance = new Company(); //���ο��� ������ �ν��Ͻ�
	
	private Company(){}//�ܺο��� Company()�� �Ժη� ������ �� ����
	
	public static Company getInstance() {//getter
		if(instance == null) {
			instance = new Company();
		}
		return instance;
		//static���� �޼ҵ� ���� ���ص� ��밡��
	}
}

package scheduler;

public interface Scheduler {
	
	void getNextCall();
	void sendCallToAgent();
}
//JDBC: Java Data Base Connectivity
//Connection, Statement�̶�� �������̽� �ִ� -> ������ ���� �Ǿ�����
//������ Oracle, MS sql, Mysql ��� �Ѵ�

//�������̽� ���
//���, �߻� �޼���, ����Ʈ �޼���, ���� �޼���, private �޼���
//�߻�޼��常 �ִٸ� ��� Ŭ������ �� �̰� ����������Ѵ�
//����Ʈ �޼���: ������ ���ϸ� ����Ʈ�� �ڵ尡 ������!
//���� �޼���: �ν��Ͻ� �������ص� �������̽� Ÿ������ ����� �� �ֵ��� ��
//private �޼���: �������̽� ���ο����� ���, �����Ǵ� �Ұ����� �޼���

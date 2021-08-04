package template;
//final �����
// ���� ����� �� ����
// �� ���� �Ҵ��� �����ϸ� �������̵� �Ұ���
// final class�� �� ��ӵ� �� ����
//	ex) String Ŭ����
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {}; //������ �ǵ� �ڵ尡 ����
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	//run()�̶�� �ó������� �ٲ�� �ȵȴ�
	//�׷��⿡ final��  �����Ѵ�
	public final void run() {
		startCar();
		drive();
		wiper();
		//wiper�� ������ ���� Ŭ�������� �ʿ���(�߻� �޼ҵ�� �����߱⿡)
		//�׷��� ���� Ŭ�������� �ڵ带 �߰����� ������ ���� �߻�
		stop();
		washCar();
		//washCar���� �����ڵ尡 ���°� �ƴ�!
		//���� ���� Ŭ�������� �߰� ������ �ʿ� X
		//�ʿ� ������ �������� �ʵ��� �� �� ����ϴ� ���
		//"�ʿ信 ���� ������"
		//���ø� �޼���: �߻� �޼��峪 ������ �޼��带 Ȱ���Ͽ� 
		//��ü ����� �帧(�ó�����)�� �����ϴ� �޼���
		//final���� ���� ������ �����ϵ� ��
		//������ ��ũ���� ���� ����
		turnOff();
	}
}

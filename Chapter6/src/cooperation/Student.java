package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1250);; //#########�ٽ� key!!!!!!!!!!!!
		//����� ��ü�� "����" �� ���̴�
		money -= 1250; //�л��� �̸�ŭ �� �����ִ����� �����ָ� �� ������?
	}
	
	public void takeSubway(Subway subway) {
		subway.take(720); //#########�ٽ� key!!!!!!!!!!!!
		//����� ��ü�� "����" �� ���̴�
		money -= 720; //�л��� �̸�ŭ �� �����ִ����� �����ָ� �� ������?
	}
	/*
	public void takeTrans(Trans trans) {
		)
	}
	*/ //�̷� ������ ���� Ŭ������ ����
	
	
	public void  showInfo() {
		System.out.println(studentName + "���� ���� ����" + money+"�Դϴ�.");
	}
}

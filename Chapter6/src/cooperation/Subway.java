package cooperation;

public class Subway {
	int lineNum;
	int passengerCnt;
	int money;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCnt ++;
		
	}
	
	public void showInfo() {
		System.out.println("����ö"+lineNum+"ȣ���� �°���"+passengerCnt+"���̰�, ������"
				+ money+"�Դϴ�");
	}
}

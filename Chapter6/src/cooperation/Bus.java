package cooperation;

public class Bus {
	int busNum;
	int passengerCnt;
	int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCnt ++;
		
	}
	
	public void showInfo() {
		System.out.println("����"+busNum+"���� �°���"+passengerCnt+"���̰�, ������"
				+ money+"�Դϴ�");
	}

	
}

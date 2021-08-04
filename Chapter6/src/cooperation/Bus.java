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
		System.out.println("버스"+busNum+"번의 승객은"+passengerCnt+"명이고, 수입은"
				+ money+"입니다");
	}

	
}

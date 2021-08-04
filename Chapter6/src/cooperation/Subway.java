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
		System.out.println("지하철"+lineNum+"호선의 승객은"+passengerCnt+"명이고, 수입은"
				+ money+"입니다");
	}
}

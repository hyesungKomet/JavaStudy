package witharraylist;

public class VIPCustomer extends Customer {
	
	//고객관리프로그램 - 고객의 등급에 따른 다른 혜택 제공
	
	private double saleRatio;	//할인율
	private int agentID;	//개인상담원
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		//overwriting
		customerGrade = "VIP"; //초기에는 모두 실버 why not Bronze
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPConstructor() 호출");
	}
	
	public int calcPrice(int price) {//overwriting - 기존 메소드를 덮어씌움
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		
		return super.showCustomerInfo()+ "담당 상담원 아이디는" + agentID+"입니다.";
	}
	
	
	
	
		
		
	

}

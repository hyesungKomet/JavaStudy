package witharraylist;
//고객관리프로그램 - 고객의 등급에 따른 다른 혜택 제공
public class Customer {
	//protected: 상속관계에서만 public, 외부관계에서는 private으로 보이도록 함
	protected int customerID;			//고객ID
	protected String customerName;		//고객이름
	protected String customerGrade;		//고객등급
	int bonusPoint;
	double bonusRatio;	//보너스
	
	/*
	private double saleRatio;	//할인율
	private int agentID;	//개인상담원
	*/
	// saleRatio, agentID는 일반 고객에게는 필요없는 속성 (only for VIPs)
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; //초기에는 모두 실버 why not Bronze
		bonusRatio = 0.01;
		
		System.out.println("Constructor() 호출");//vip보다 먼저 출력됨(먼저 생성됨을 알 수 있다)
	}
	
	public int calcPrice(int price) {
		/*
		if(customerGrade == "Silver") {
			
		}
		else if(customerGrade == "VIP") {
			
		}
		*/
		// ... 이렇게 등급이 엄청 많아지면 정말 비효율적인 코드가 된다...
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은"+customerGrade+"이며, 보너스는"+bonusPoint+"입니다";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}

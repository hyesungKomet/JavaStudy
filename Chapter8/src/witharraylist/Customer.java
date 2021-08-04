package witharraylist;
//���������α׷� - ���� ��޿� ���� �ٸ� ���� ����
public class Customer {
	//protected: ��Ӱ��迡���� public, �ܺΰ��迡���� private���� ���̵��� ��
	protected int customerID;			//��ID
	protected String customerName;		//���̸�
	protected String customerGrade;		//�����
	int bonusPoint;
	double bonusRatio;	//���ʽ�
	
	/*
	private double saleRatio;	//������
	private int agentID;	//���λ���
	*/
	// saleRatio, agentID�� �Ϲ� �����Դ� �ʿ���� �Ӽ� (only for VIPs)
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; //�ʱ⿡�� ��� �ǹ� why not Bronze
		bonusRatio = 0.01;
		
		System.out.println("Constructor() ȣ��");//vip���� ���� ��µ�(���� �������� �� �� �ִ�)
	}
	
	public int calcPrice(int price) {
		/*
		if(customerGrade == "Silver") {
			
		}
		else if(customerGrade == "VIP") {
			
		}
		*/
		// ... �̷��� ����� ��û �������� ���� ��ȿ������ �ڵ尡 �ȴ�...
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"���� �����"+customerGrade+"�̸�, ���ʽ���"+bonusPoint+"�Դϴ�";
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

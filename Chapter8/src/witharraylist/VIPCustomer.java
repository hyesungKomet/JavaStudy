package witharraylist;

public class VIPCustomer extends Customer {
	
	//���������α׷� - ���� ��޿� ���� �ٸ� ���� ����
	
	private double saleRatio;	//������
	private int agentID;	//���λ���
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		//overwriting
		customerGrade = "VIP"; //�ʱ⿡�� ��� �ǹ� why not Bronze
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPConstructor() ȣ��");
	}
	
	public int calcPrice(int price) {//overwriting - ���� �޼ҵ带 �����
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		
		return super.showCustomerInfo()+ "��� ���� ���̵��" + agentID+"�Դϴ�.";
	}
	
	
	
	
		
		
	

}

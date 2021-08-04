package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		//buyer�� buy�� ����
		Buy buyer = customer;
		buyer.buy();
		
		//seller�� sell�� ����
		Sell seller = customer;
		seller.sell();
		
		//customer�� buy, sell �� ����
		customer.buy();
		customer.sell();
		
		//�� �� customer�� �������̵��� ���� ��µ�
		//���� assign�� �ν��Ͻ��� customer�̱⿡ ���� order��	
		customer.order();
		buyer.order();
		seller.order();
	}

}

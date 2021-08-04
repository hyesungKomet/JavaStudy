package inheritance;

public class OverridingTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10000, "Lee");
		int price = customerLee.calcPrice(1000);
		System.out.println("���� �ݾ���"+price+customerLee.showCustomerInfo());
		
		VIPCustomer customerPark = new VIPCustomer(10001, "Park", 1010);
		int price2 = customerPark.calcPrice(1000);
		System.out.println("���� �ݾ���"+price2+customerPark.showCustomerInfo());
		
		Customer customerWho = new VIPCustomer(10002, "Who", 1011);
		//��ĳ���ý� ���̴� Ÿ���� Customer�ε� calcPrice�� �����ǵ� ���� Ŭ������  VIPCustomer�� �޼ҵ尡 ȣ���
		int price3 = customerWho.calcPrice(1000);
		System.out.println("���� �ݾ���"+price3+customerPark.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}
}

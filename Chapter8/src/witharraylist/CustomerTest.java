package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10011, "�Ż��Ӵ�");
		
		GoldCustomer customerHur = new GoldCustomer(10012, "����");
		GoldCustomer customerKim = new GoldCustomer(10013, "������");
		VIPCustomer customerPark = new VIPCustomer(10014, "�ڼ�", 12345);
		
		customerList.add(customerPark);
		customerList.add(customerKim);
		customerList.add(customerHur);
		customerList.add(customerShin);
		customerList.add(customerLee);
		
		System.out.println("====== ������ ��� ===");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ�����Ʈ ��� ===");
		
		int price = 10000;
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+ "����"+cost+"�� �����ϼ̽��ϴ�");
			System.out.println(customer.showCustomerInfo());
		}
	}
}

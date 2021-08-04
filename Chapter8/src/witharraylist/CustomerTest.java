package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10011, "신사임당");
		
		GoldCustomer customerHur = new GoldCustomer(10012, "허준");
		GoldCustomer customerKim = new GoldCustomer(10013, "김혜성");
		VIPCustomer customerPark = new VIPCustomer(10014, "박수", 12345);
		
		customerList.add(customerPark);
		customerList.add(customerKim);
		customerList.add(customerHur);
		customerList.add(customerShin);
		customerList.add(customerLee);
		
		System.out.println("====== 고객정보 출력 ===");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스포인트 결과 ===");
		
		int price = 10000;
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+ "님이"+cost+"를 지불하셨습니다");
			System.out.println(customer.showCustomerInfo());
		}
	}
}

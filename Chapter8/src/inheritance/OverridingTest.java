package inheritance;

public class OverridingTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10000, "Lee");
		int price = customerLee.calcPrice(1000);
		System.out.println("지불 금액은"+price+customerLee.showCustomerInfo());
		
		VIPCustomer customerPark = new VIPCustomer(10001, "Park", 1010);
		int price2 = customerPark.calcPrice(1000);
		System.out.println("지불 금액은"+price2+customerPark.showCustomerInfo());
		
		Customer customerWho = new VIPCustomer(10002, "Who", 1011);
		//업캐스팅시 쓰이는 타입은 Customer인데 calcPrice는 재정의된 하위 클래스인  VIPCustomer의 메소드가 호출됨
		int price3 = customerWho.calcPrice(1000);
		System.out.println("지불 금액은"+price3+customerPark.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}
}

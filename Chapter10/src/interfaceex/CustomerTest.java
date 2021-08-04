package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		//buyer은 buy만 가능
		Buy buyer = customer;
		buyer.buy();
		
		//seller은 sell만 가능
		Sell seller = customer;
		seller.sell();
		
		//customer은 buy, sell 다 가능
		customer.buy();
		customer.sell();
		
		//셋 다 customer의 오버라이딩된 값이 출력됨
		//현재 assign된 인스턴스가 customer이기에 이의 order들어감	
		customer.order();
		buyer.order();
		seller.order();
	}

}

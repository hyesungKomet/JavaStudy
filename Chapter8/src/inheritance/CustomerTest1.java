package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerKim = new Customer(2020310461, "Kim");
		
		VIPCustomer customerComet = new VIPCustomer(12345, "Comet", 1000);
		customerComet.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerComet.showCustomerInfo());
	}
}

package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	//Buy, Sell의 defalut method가 겹칠 시 오버라이딩 필요
	@Override
	public void order() {
		System.out.println("고객 판매 구매 주문");
		//Buy.super.order();
	}

}

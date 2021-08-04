package abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		Computer c1 = new Computer(); //추상 클래스는 인스턴스화가 필요 없다
		Computer c2= new Labtop();
		Computer c3 = new MyLabTop();
		Computer c4 = new Desktop();
	}
}

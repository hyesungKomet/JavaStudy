package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){
			throw new Exception(); //���� �θ���
		}catch(Exception e) {
			System.out.println("Exception");
		}
		//finally ���� �ʾƵ� close�� �Ҹ���
		//finally �ʿ� x
	}
}

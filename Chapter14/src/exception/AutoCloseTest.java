package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){
			throw new Exception(); //에러 부르기
		}catch(Exception e) {
			System.out.println("Exception");
		}
		//finally 하지 않아도 close가 불린다
		//finally 필요 x
	}
}

package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >=y)? x: y;
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		//내부적으로는 익명 객체가 선언됨
		//anonymous inner class
		//객체 없이는 메서드 실행 안된다
	
	}

}

package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		//i<5여야 하는데 i<=5 --> 에러
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;
		//finally는 try다음에 무조건 실행되므로
		//return이전에 finally 실행됨
		}finally {
			System.out.println("finally");
		}
		//예외처리를 안하면 end가 출력되지 않는다!
		System.out.println("end");
	}
}

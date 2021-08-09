package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		//i<5���� �ϴµ� i<=5 --> ����
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;
		//finally�� try������ ������ ����ǹǷ�
		//return������ finally �����
		}finally {
			System.out.println("finally");
		}
		//����ó���� ���ϸ� end�� ��µ��� �ʴ´�!
		System.out.println("end");
	}
}

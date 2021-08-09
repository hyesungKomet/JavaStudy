package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable(final int i) {
		
		int localNum = 100;
		
		return new Runnable() {
			@Override
			public void run() {
				outNum += 10;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		};
		//�Ʒ��� �ڵ忡�� class�� �ǹ� ���⿡
		//��ó�� �ٿ��� �� �� �ִ�
		/*
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				//���������� ����� ������
				//������ �ȵ�
				//���� �޸𸮿��� �̹� ������� �� �־
				//final�� �����Ѵ�(����� ��)
				//localNum += 100;
				//i += 200;
				
				//�ν��Ͻ� ������ ����
				outNum += 10;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		}
		return new MyRunnable();
		*/
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		
		
	}

}

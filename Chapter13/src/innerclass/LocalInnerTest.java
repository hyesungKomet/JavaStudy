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
		//아래의 코드에서 class가 의미 없기에
		//위처럼 줄여서 쓸 수 있다
		/*
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				//지역변수는 출력은 되지만
				//수정은 안됨
				//스택 메모리에서 이미 사라졌을 수 있어서
				//final로 선언한다(상수로 됨)
				//localNum += 100;
				//i += 200;
				
				//인스턴스 변수는 ㄱㅊ
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

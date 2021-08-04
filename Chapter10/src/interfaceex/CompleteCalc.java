package interfaceex;
//public class CompleteCalc extends Calculator implements Calc, Runnable, Game, etc
//처럼 여러 인터페이스를 implements 할 수 있다
public class CompleteCalc extends Calculator{
	//구현상속
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다");
	}

}

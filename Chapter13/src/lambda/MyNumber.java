package lambda;

@FunctionalInterface
//람다식의 경우 하나의 메서드만 구현해야 함
//저 annotation을 통해 메서드가 추가되면 에러 발생하도록 함

public interface MyNumber {
	
	int getMaxNumber(int num1, int num2);
	//int testNumber(int x, int y);
}

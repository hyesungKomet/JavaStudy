package classpart;

public class Function {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int result = addNum(num1, num2);
		
		System.out.println(result);
	}
	
	public static int addNum(int a, int b) {
		int sum = a+b;
		return sum;
	}
}

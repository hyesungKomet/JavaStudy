package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		//lambda식 대입
		PrintString lambdaPrint = str->System.out.println(str);
		lambdaPrint.showString("comet");
	
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
	
	//lambda식이 매개변수로 넘어와서 쓰인다
	public static void showMyString(PrintString lambda) {
		lambda.showString("comet2");
	}
	
	//lambda 반환
	public static PrintString returnPrint() {
		
		return s -> System.out.println(s+"world");
	}

}

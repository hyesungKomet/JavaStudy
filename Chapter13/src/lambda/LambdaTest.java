package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		//lambda�� ����
		PrintString lambdaPrint = str->System.out.println(str);
		lambdaPrint.showString("comet");
	
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
	
	//lambda���� �Ű������� �Ѿ�ͼ� ���δ�
	public static void showMyString(PrintString lambda) {
		lambda.showString("comet2");
	}
	
	//lambda ��ȯ
	public static PrintString returnPrint() {
		
		return s -> System.out.println(s+"world");
	}

}

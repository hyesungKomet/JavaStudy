package helloworld;

public class Variable {

	public static void main(String[] args) {
		int num;	//변수 선언 후 사용안해서 경고용 줄 표시됨
		num = 10;
		/*
		long num1 = 123456789000; // long으로 해도 수 자체는 4byte로 저장되기에 오류
		long num2 = 123456789000L;//L써줘서 저장도 8byte로 되도록 변경
		*/
		
		System.out.println(num);
	}

}

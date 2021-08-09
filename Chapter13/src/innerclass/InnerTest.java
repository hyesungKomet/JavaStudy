package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	
	public OutClass(){
		inClass = new InClass();
	}
	class InClass{
		int inNum = 200;
		//innerclass 에서는 static 변수 선언 불가
		//static int sInNum = 100;
		
		void inTest() {
			//outclass의 instance 변수 num과 sNum
			System.out.println(num);
			System.out.println(sNum);
		}
		
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//외부클래스의 인스턴스 변수 사용 불가
			//num += 10;
			//sNum은 정적 변수이기에 가능
			sNum += 10;
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			//정적 클래스의 정적 메소드는
			//정적 클래스의 생성과 무관하게 실행되므로
			//iNum은 사용 불가
			//System.out.println(iNum);
			System.out.println(sInNum);
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
		
		//방법1
		//OutClass outClass = new OutClass();
		//outClass.inClass.inTest();
		
		//방법2
		//OutClass.InClass inClass = outClass.new InClass();
		//inClass.inTest();
	
		//만약 inClass가 private이라면 이렇게 쓰면 된다
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		//outClass->usingInTest->inClass.inTest()
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		//다른 생성 없어도 아래 코드는 실행 가능
		OutClass.InStaticClass.sTest();
	}

}

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
		//innerclass ������ static ���� ���� �Ұ�
		//static int sInNum = 100;
		
		void inTest() {
			//outclass�� instance ���� num�� sNum
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
			//�ܺ�Ŭ������ �ν��Ͻ� ���� ��� �Ұ�
			//num += 10;
			//sNum�� ���� �����̱⿡ ����
			sNum += 10;
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			//���� Ŭ������ ���� �޼ҵ��
			//���� Ŭ������ ������ �����ϰ� ����ǹǷ�
			//iNum�� ��� �Ұ�
			//System.out.println(iNum);
			System.out.println(sInNum);
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
		
		//���1
		//OutClass outClass = new OutClass();
		//outClass.inClass.inTest();
		
		//���2
		//OutClass.InClass inClass = outClass.new InClass();
		//inClass.inTest();
	
		//���� inClass�� private�̶�� �̷��� ���� �ȴ�
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		//outClass->usingInTest->inClass.inTest()
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		//�ٸ� ���� ��� �Ʒ� �ڵ�� ���� ����
		OutClass.InStaticClass.sTest();
	}

}

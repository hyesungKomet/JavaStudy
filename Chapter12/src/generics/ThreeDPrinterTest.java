//���׸� Ŭ���� ���� ���� �ڷ������� ��ü�� �κ��� �ϳ��� ���ڷ� ǥ��
//�̸� �ڷ��� �Ű������� �θ�
//<T> <>: ���̾Ƹ�� ������
//static Ű����� T ��� �Ұ�

package generics;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());
		
		//��ȯ���� obj�̱⿡ (Powder)���� - �ٿ�ĳ����
		Powder powder = printer.getMaterial();
		
		System.out.println(printer);
		
		
		TreeDPrinter<Plastic> printer2 = new TreeDPrinter<Plastic>();
		
		printer2.setMaterial(new Plastic());
		
		//��ȯ���� obj�̱⿡ (Powder)���� - �ٿ�ĳ����
		Plastic plastic = printer2.getMaterial();
		
		System.out.println(printer2);
		
		//�̺κ��� ���� Material�� extends���� �ʾƼ� �� �� ��������
		/*
		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
		printerWater.setMaterial(new Water());
		
		System.out.println(printerWater);
		*/
		
		printer2.printing();
		
	}
}
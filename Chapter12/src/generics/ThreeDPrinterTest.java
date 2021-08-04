//제네릭 클래싀 여러 참조 자료형으로 대체될 부분을 하나의 문자로 표현
//이를 자료형 매개변수로 부름
//<T> <>: 다이아몬드 연산자
//static 키워드는 T 사용 불가

package generics;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());
		
		//반환값이 obj이기에 (Powder)해줌 - 다운캐스팅
		Powder powder = printer.getMaterial();
		
		System.out.println(printer);
		
		
		TreeDPrinter<Plastic> printer2 = new TreeDPrinter<Plastic>();
		
		printer2.setMaterial(new Plastic());
		
		//반환값이 obj이기에 (Powder)해줌 - 다운캐스팅
		Plastic plastic = printer2.getMaterial();
		
		System.out.println(printer2);
		
		//이부분은 물이 Material을 extends하지 않아서 쓸 수 없어진다
		/*
		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
		printerWater.setMaterial(new Water());
		
		System.out.println(printerWater);
		*/
		
		printer2.printing();
		
	}
}

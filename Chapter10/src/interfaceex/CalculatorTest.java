// ##�������̽��� ������
// �������̽��� "client code"�� ���񽺸� �����ϴ� ��ü ������ ���
//client code�� �������̽� ��� Ŭ������ ������ �ν��Ͻ� �ڵ��
// client�� ���� ��� ������� interface�� ���Ǹ� ������ ����� ��
//�־�� �� ex) JDBC

package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();	
		//Calc calc1 = new Calc();//�������̽��� �����Ұ�
		calc.add(num1, num2); //12
		System.out.println(calc.divide(num1,  num2));//5
		
		Calculator calc2 = new CompleteCalc();
		//CompleteCalc�� ��� Ÿ���� ������ �����ϴ�!
		//���� Calc�� Calculator�� �Ѵٸ� ��Ģ���길 ����
		//CompleteCalc Ÿ������ �� ��� �� ���� showInfo()�� ����
		
		
		
		
		//System.out.println(num1+num2);
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));

	}

}
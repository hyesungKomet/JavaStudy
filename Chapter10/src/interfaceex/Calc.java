//�������̽�: ��� �޼��尡 �߻� �޼����� Ŭ����

//������ ���� �ְ� ���� ����
//��� �޼���� public abstract
//��� ������ public static final

//�������̽� ������ ���� ������ �߿��� �κ���
//�� ���̷����� �������� ��ü�� �ڵ带 �ۼ��Ѵ�

//Calc �������̽��� Calculator Ŭ�������� ����
//�� �� ��� �޼��� ������ �̷������ �ʾƼ� �߻�Ŭ������ ��
//CompleteCalc Ŭ������ Calculator ��ӹ޾Ƽ� ��� �޼��� ����

// interface implements: Ÿ�� ���
// class extends : ���� ���

// ##�������̽� ������ �� ��ȯ
// Ŭ���� ��Ӱ� �޸� �����ڵ尡 ���⿡ ���� �������̽� ���� ����
// �� ��ȯ�� ��밡���� �޼���� �������̽��� ����� �޼��常

//���߻���� �ȵ����� �������̽��� ������ ����
//ex) customer�� Sell, Buy��� �ΰ��� �������̽� ���
//implement�����ϴ�

//�������̽� ���
//���� �������̽� ��� ����
//�̴� �� ����̶����(���� �ڵ��� ����� �ƴϱ⿡)

//Ŭ���� ���, �������̽� ������ �� �� �ϰ� ���� ���
//public class BookShelf extends Shelf implements Queue{}
//�� ���� Ŭ���� ������ �Ѵ�
//���� �����ӿ�ũ(������, �ȵ���̵� ��)�� ������ �� �� �̷� ��찡 �� �ִ�


package interfaceex;
//������ abstract class, abstract method�� 
//�ؾ� �ϴµ� interface�� �ϸ� �� ���� ����������
public interface Calc {
	double PI = 3.14;
	// == public static final double
	int ERROR = -99999999;
	//���¸�ü�� �Ǿ������� ���� ������ ���̴�
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//����Ʈ �޼���
	default void description() {
		System.out.println("���� ���⸦ �����Ѵ�");
	}
	//static �޼���
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		return total;
	}
}

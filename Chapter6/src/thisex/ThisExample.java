package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// year = year; �̷��� ���� �Ѵ� ���������� setYear�� �μ� �ǹ� - �ǹ̾���
		this.year = year; // �̷��� �ؾ� ������� �ǹ�(�Ķ�)
	}
	
	public void printThis() {
		System.out.println(this); //this�� �����
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		System.out.println(b1);
		b1.printThis();	//b1�� �ּҸ� this�� ����Ŵ�� �� �� �̵�
		
		Birthday b2 = new Birthday();
		System.out.println(b2);
		b2.printThis(); //�ٸ� �ν��Ͻ��� �ٸ� �ּ� ����Ŵ(b1�� b2�� �ּ� �ٸ�)

	}

}

//Clone: ��ü�� ���� �����ϴµ� ���̴� �޼���
//��ü�� ����(������� ��) ���� �ν��Ͻ��� �� ������
//���� ��������, ��ü��ȣ ������ �����
//clone()�޼��� ������ؼ��� cloneable �������̽� �����ؾ� ��!!


package object;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x+","+"y="+y;
	}
}

//cloneable implements �� �������־����
//�̷��� clone�������� �˷���
class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "������ "+this.point+"�̰�, �������� "+radius+"�Դϴ�";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class ObjectCloneTest {
	//Ŭ���� �ȵ� �� - ����ó��?������
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		//���� �ٿ�ĳ���� - Object�� ��ȯ���̾
		Circle cloneCircle = (Circle)circle.clone();
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
	
		System.out.println(circle);
		System.out.println(cloneCircle);
	}
}
package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student comet = new Student("comet", 50000);
		Student james = new Student("james", 15000);
		
		Bus bus9300 = new Bus(9300);
		james.takeBus(bus9300);
		james.showInfo();
		bus9300.showInfo();
		
		Subway subway4 = new Subway(4);
		comet.takeSubway(subway4);
		comet.showInfo();
		subway4.showInfo();
		
		/*
		����, ����ö �Ѵ� take��� �޼ҵ尡 �ֱ⿡ �̰� ���� Ŭ����(�߻� Ŭ����)�� trans����
		���� ������ ���� �ִ�
		�� ��� student Ŭ������ bus, subway�� �ƴ� trans��� ���� Ŭ������ �����ϸ� �ȴ�
		
		 */

	}

}

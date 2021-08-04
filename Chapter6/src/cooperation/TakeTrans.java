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
		버스, 지하철 둘다 take라는 메소드가 있기에 이걸 상위 클래스(추상 클래스)인 trans에서
		만들어서 관리할 수도 있다
		이 경우 student 클래스는 bus, subway가 아닌 trans라는 상위 클래스와 협업하면 된다
		
		 */

	}

}

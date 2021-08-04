package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1250);; //#########핵심 key!!!!!!!!!!!!
		//요것이 객체의 "협업" 인 것이다
		money -= 1250; //학생이 이만큼 돈 갖고있는지도 따져주면 더 좋겠쥬?
	}
	
	public void takeSubway(Subway subway) {
		subway.take(720); //#########핵심 key!!!!!!!!!!!!
		//요것이 객체의 "협업" 인 것이다
		money -= 720; //학생이 이만큼 돈 갖고있는지도 따져주면 더 좋겠쥬?
	}
	/*
	public void takeTrans(Trans trans) {
		)
	}
	*/ //이런 식으로 상위 클래스와 협업
	
	
	public void  showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money+"입니다.");
	}
}

package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student(100, "김만중");
		studentKim.setKorean("국어", 100);
		studentKim.setMath("수학", 100);
		
		Student studentLee = new Student(100, "이지은");
		studentLee.setKorean("국어", 40);
		studentLee.setMath("수학", 96);
		
		studentKim.showStudentInfo();
		studentLee.showStudentInfo();
		
	}

}

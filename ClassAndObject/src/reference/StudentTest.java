package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student(100, "�踸��");
		studentKim.setKorean("����", 100);
		studentKim.setMath("����", 100);
		
		Student studentLee = new Student(100, "������");
		studentLee.setKorean("����", 40);
		studentLee.setMath("����", 96);
		
		studentKim.showStudentInfo();
		studentLee.showStudentInfo();
		
	}

}

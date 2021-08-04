package array;
//arraylist main
public class StudentTest {
	public static void main(String[] args) {
		Student comet = new Student(101, "Comet");
		comet.addSubject("Korean", 60);
		comet.addSubject("Math", 100);
		comet.showStudentInfo();
		
		System.out.println("=================");
		
		Student kim = new Student(102, "Kim");
		kim.addSubject("Korean", 100);
		kim.addSubject("Math", 50);
		kim.addSubject("English", 90);
		kim.showStudentInfo();
	}
}

package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); //10001
		
		Student studentT = new Student();
		System.out.println(studentT.studentID); //10002
		
		System.out.println(studentJ.getSerialNum()); //이 둘은 공유되는 static 변수라
		System.out.println(studentT.getSerialNum()); //같은 값이 들어있다
		//이런식으로 안쓴다(인스턴스 변수가 아니라 클래스 변수.static으로 쓴다)
		//Student.serialNum으로.
		//인스턴스 생성 안해도 serial은 출력됨
	}

}

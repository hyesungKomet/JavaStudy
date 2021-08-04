package staticex;

public class Student {
	int studentID;
	String studentName;
	
	private static int serialNum = 10000;//정보 은닉을 위해 private
	
	public Student() {
		serialNum++; //공유되면서 증가됨
		studentID = serialNum; //공유X 각 인스턴스마다 다르게 됨
	}
	
	public static int getSerialNum() {// getter만 사용(setter는 아예 사용X)
		int i = 10; //이처럼 지역변수를 선언하는 것은 가능
		//but!!!!!!!!!!
		//StudentName = "Comet"; //이처럼 static method안에서 인스턴스 변수 선언은 불가능
		// static 메소드는 인스턴스 변수를 메인에서 선언하지 않고도
		//Student.getSerialNum으로 사용할 수 있는데, 이 경우에는 선언되지도 않은
		//인스턴스 변수인 studentName이 호출된거기에 에러 발생!!!
		
		
		return serialNum;
	}
}

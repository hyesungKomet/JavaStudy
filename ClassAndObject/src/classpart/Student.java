package classpart;

public class Student {

	
		int studentID;
		String studentName;//string은 클래스다!
		int grade;
		String address;
		
		//default 생성자
		//public Student() {}
		//생성자	
		public Student(int id, String name) {
			studentID = id;
			studentName = name;
		}
		
		public void showStudentInfo() {
			System.out.println(studentName+","+address);
		}
		
		public String getStudentName() {//student name반환 함수
			return studentName;
		}
		
		public void setStudentName(String name) {//student name 변경 함수
			studentName = name;
		}
		
		
	public static void main(String[] args) {
		Student studentLee = new Student(310461, "코멧킴");//힙메모리에 생성
		
		studentLee.address = "미국 샌디에고";
		
		Student studentKim = new Student(102, "가마솥");//힙메모리에 생성
		studentKim.studentName = "김만중";
		studentKim.studentID = 101;
		studentKim.address = "경기도 성남시 분당구 판교동";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		 
		
	}
	 //이렇게 class 안에서 메인 쓸 수도 있다 but 다른 클래스에서 쓰는게 일반적

}

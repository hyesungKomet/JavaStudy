package classpart;

public class Students {//실제로는 package name. class여서 classpart.Students이다

	public static void main(String[] args) {//메인만 뺸 코드
		Student studentLee = new Student(3, "fe");
		studentLee.studentName = "이순신";
		studentLee.address = "경기도 성남시 분당구 수내동";
		
		studentLee.showStudentInfo();
	}

}

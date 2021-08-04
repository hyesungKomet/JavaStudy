package reference;

public class Student {
	/*
	int studentID;
	String studentName;
	int koreanScore;
	int mathScore;
	String koreanSubject;
	String mathSubject;
	
	int engScore;
	String engSubject; */
	// 점수와 과목으로 나누면 더 깔끔해질것
	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student() {
		korean = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.setSubjectName(name);
		korean.setScore(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korean.getScore() + math.getScore();
		System.out.println(studentName+"학생의 총점은 "+total+"점 입니다.");
	}
}

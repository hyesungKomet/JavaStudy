package classpart;

public class Student {

	
		int studentID;
		String studentName;//string�� Ŭ������!
		int grade;
		String address;
		
		//default ������
		//public Student() {}
		//������	
		public Student(int id, String name) {
			studentID = id;
			studentName = name;
		}
		
		public void showStudentInfo() {
			System.out.println(studentName+","+address);
		}
		
		public String getStudentName() {//student name��ȯ �Լ�
			return studentName;
		}
		
		public void setStudentName(String name) {//student name ���� �Լ�
			studentName = name;
		}
		
		
	public static void main(String[] args) {
		Student studentLee = new Student(310461, "�ڸ�Ŵ");//���޸𸮿� ����
		
		studentLee.address = "�̱� ���𿡰�";
		
		Student studentKim = new Student(102, "������");//���޸𸮿� ����
		studentKim.studentName = "�踸��";
		studentKim.studentID = 101;
		studentKim.address = "��⵵ ������ �д籸 �Ǳ���";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		 
		
	}
	 //�̷��� class �ȿ��� ���� �� ���� �ִ� but �ٸ� Ŭ�������� ���°� �Ϲ���

}

package classpart;

public class Students {//�����δ� package name. class���� classpart.Students�̴�

	public static void main(String[] args) {//���θ� �A �ڵ�
		Student studentLee = new Student(3, "fe");
		studentLee.studentName = "�̼���";
		studentLee.address = "��⵵ ������ �д籸 ������";
		
		studentLee.showStudentInfo();
	}

}

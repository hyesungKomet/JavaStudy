package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	//����� ���� ����ó��
	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("���̵�� null �ȵ�");
		}
		else if(userID.length()<8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻�, 20�� ����");
		}
		this.userID = userID;
	}
	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e);
		}
		
		userID = "1234567";
		try {
			idTest.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}

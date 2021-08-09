package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	//사용자 지정 예외처리
	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("아이디는 null 안됨");
		}
		else if(userID.length()<8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상, 20자 이하");
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

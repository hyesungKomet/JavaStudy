package singleton;

public class Company {
	
	private static Company instance = new Company(); //내부에서 생성된 인스턴스
	
	private Company(){}//외부에서 Company()를 함부로 선언할 수 없다
	
	public static Company getInstance() {//getter
		if(instance == null) {
			instance = new Company();
		}
		return instance;
		//static으로 메소드 생성 안해도 사용가능
	}
}

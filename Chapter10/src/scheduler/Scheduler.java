package scheduler;

public interface Scheduler {
	
	void getNextCall();
	void sendCallToAgent();
}
//JDBC: Java Data Base Connectivity
//Connection, Statement이라는 인터페이스 있다 -> 가보면 선언만 되어있음
//구현은 Oracle, MS sql, Mysql 등에서 한다

//인터페이스 요소
//상수, 추상 메서드, 디폴트 메서드, 정적 메서드, private 메서드
//추상메서드만 있다면 모든 클래스가 다 이걸 구현해줘야한다
//디폴트 메서드: 재정의 안하면 디폴트된 코드가 들어가도록!
//정적 메서드: 인스턴스 생성안해도 인터페이스 타입으로 사용할 수 있도록 함
//private 메서드: 인터페이스 내부에서만 사용, 재정의는 불가능한 메서드

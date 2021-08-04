package gamelevel;
//이렇게 초급, 중급, 고급을 클래스로 안나누면
//if else문이 무지무지 많이많이 들어간다 -> 객체 지향 언어 활용도 낮음
//어떤 상위클래스를 참조할지를 생각하며 다시 복습해봅시당!
public class Player {
	//private!!
	private PlayerLevel level;
	
	//constructor
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		//왜 인수로 PlayerLevel level받는지 think!
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}

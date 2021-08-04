package gamelevel;
//�̷��� �ʱ�, �߱�, ����� Ŭ������ �ȳ�����
//if else���� �������� ���̸��� ���� -> ��ü ���� ��� Ȱ�뵵 ����
//� ����Ŭ������ ���������� �����ϸ� �ٽ� �����غ��ô�!
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
		//�� �μ��� PlayerLevel level�޴��� think!
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}

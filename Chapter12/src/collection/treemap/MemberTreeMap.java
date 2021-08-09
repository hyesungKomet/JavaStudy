//treemap Ŭ����: key��ü�� �����ؼ� key-value pair�� ����
//Comparable, Comparator interface ����


package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	public MemberTreeMap() {
		//Integer���� Comparable�� �̹�
		//�����Ǿ� �־ ������ �Ǿ� ��µȴ�!!
		//Autoboxing���� Integer�� int�� �ڵ���ȯ��
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId+" �� �������� �ʽ��ϴ�");
		return false;
	}
	//iterator - pair�� �̷���� ��ü ��ȸ
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
	
}

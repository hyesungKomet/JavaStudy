//treemap Ŭ����: key��ü�� �����ؼ� key-value pair�� ����
//Comparable, Comparator interface ����

//Map Interface: key-value pair�� ��ü ����
//key�� �ߺ� �Ұ�
//�˻� ���� �ڷᱸ��
//key�̿��ؼ� �� ����, �˻�, ������ ����
//key�� �Ǵ� ��ü�� ���ϼ��� ���� �˱� ����
//equals(), hashCode() �޼��� ������ �ʿ�

//HashMap Class: Map Interface ���� Ŭ������ �Ϲ���
//Vectoró�� ����ȭ ����

package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId+" �� �������� �ʽ��ϴ�");
		return false;
	}
	//iterator - pair�� �̷���� ��ü ��ȸ
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
}

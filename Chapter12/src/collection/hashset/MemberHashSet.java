package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	//Ctrl + Shift + O => import collection.Member
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		//��� iterator! Collection�� ��ȸ��
		//hashSet���� set������ �ߺ� ��븸 �ȵǰ�
		//������ ���⿡ "���� �ε���"��� ������ ���
		//�ε����� get�� �� �� ����
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			//arrayList������ get�� ���� ���
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAll() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		
		System.out.println(hashSet);
		System.out.println();
	}
}

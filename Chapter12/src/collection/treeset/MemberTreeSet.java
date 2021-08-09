//Comparable, Comparator Interface
//���� ����� �Ǵ� Ŭ������ �����ؾ� �ϴ� �������̽�
//Comparable: compareTo() �޼��� ���� - �Ű������� ��ü �ڽ�(this) ��
//Comparator: compare() �޼��� ���� - �� �Ű����� ��
//Comparator: TreeSet �����ڿ� Comparator ������ ��ü�� �Ű������� ����!!
//TreeSet<Member> treeSet = new TreeSet<Member>(new Member());



package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	//Ctrl + Shift + O => import collection.Member
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		//��� iterator! Collection�� ��ȸ��
		//hashSet���� set������ �ߺ� ��븸 �ȵǰ�
		//������ ���⿡ "���� �ε���"��� ������ ���
		//�ε����� get�� �� �� ����
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			//arrayList������ get�� ���� ���
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAll() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		
		System.out.println(treeSet);
		System.out.println();
	}
}

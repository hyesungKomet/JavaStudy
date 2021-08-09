//Comparable, Comparator Interface
//정렬 대상이 되는 클래스가 구현해야 하는 인터페이스
//Comparable: compareTo() 메서드 구현 - 매개변수와 객체 자신(this) 비교
//Comparator: compare() 메서드 구현 - 두 매개변수 비교
//Comparator: TreeSet 생성자에 Comparator 구현된 객체를 매개변수로 전달!!
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
		
		//잠깐 iterator! Collection을 순회함
		//hashSet등의 set에서는 중복 허용만 안되고
		//순서가 없기에 "다음 인덱스"라는 개념이 없어서
		//인덱스로 get할 수 가 없다
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			//arrayList에서의 get과 같은 기능
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
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

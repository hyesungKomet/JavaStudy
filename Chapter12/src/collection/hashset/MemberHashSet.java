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
		
		//잠깐 iterator! Collection을 순회함
		//hashSet등의 set에서는 중복 허용만 안되고
		//순서가 없기에 "다음 인덱스"라는 개념이 없어서
		//인덱스로 get할 수 가 없다
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			//arrayList에서의 get과 같은 기능
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
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

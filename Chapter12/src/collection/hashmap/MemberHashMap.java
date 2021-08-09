//treemap 클래스: key객체를 정렬해서 key-value pair로 관리
//Comparable, Comparator interface 구현

//Map Interface: key-value pair의 객체 관리
//key는 중복 불가
//검색 위한 자료구조
//key이용해서 값 저장, 검색, 삭제시 용이
//key가 되는 객체는 유일성의 여부 알기 위해
//equals(), hashCode() 메서드 재정의 필요

//HashMap Class: Map Interface 구현 클래스중 일반적
//Vector처럼 동기화 제공

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
		
		System.out.println(memberId+" 가 존재하지 않습니다");
		return false;
	}
	//iterator - pair로 이루어진 객체 순회
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
}

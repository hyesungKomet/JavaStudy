//treemap 클래스: key객체를 정렬해서 key-value pair로 관리
//Comparable, Comparator interface 구현


package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	public MemberTreeMap() {
		//Integer에서 Comparable이 이미
		//구현되어 있어서 정렬이 되어 출력된다!!
		//Autoboxing으로 Integer이 int로 자동변환됨
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
		
		System.out.println(memberId+" 가 존재하지 않습니다");
		return false;
	}
	//iterator - pair로 이루어진 객체 순회
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
	
}

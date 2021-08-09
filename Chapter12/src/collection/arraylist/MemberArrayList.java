//멀티 쓰레드 상태에서 리소스에 대한 동기화가 필요한 경우
//Vector를 사용! - 동기화 지원(하나의 리소스에 lock걸어줌)
//동기화 기능이 추가되어야 할 경우
// Collections.synchronizedList(new ArrayList<String>());
//동기화: 두 쓰레드가 동시에 하나의 리소스에 접근할 때 순서를 맞추어서
//데이터에 오류 발생하지 않도록 함
//단일 쓰레드에서 동기화를 하는 것은 오버헤드 - 비효율적




package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	//Ctrl + Shift + O => import collection.Member
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*
		for(int i=0;i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		//잠깐 iterator! Collection을 순회함
		//hashSet등의 set에서는 중복 허용만 안되고
		//순서가 없기에 "다음 인덱스"라는 개념이 없어서
		//인덱스로 get할 수 가 없다
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			//arrayList에서의 get과 같은 기능
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAll() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		
		System.out.println(arrayList);
		System.out.println();
	}
}

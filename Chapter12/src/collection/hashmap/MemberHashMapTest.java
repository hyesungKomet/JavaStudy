package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(102, "�̼ҷ�");
		Member memberKim = new Member(101, "���ڸ�");
		Member memberPark = new Member(103, "�ڼ�");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberPark);

		memberHashMap.showAllMember();
		
		//bruce lee is gone
		memberHashMap.removeMember(102);
		memberHashMap.showAllMember();
	}

}

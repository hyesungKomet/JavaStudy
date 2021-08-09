package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(102, "ÀÌ¼Ò·æ");
		Member memberKim = new Member(101, "±èÄÚ¸ä");
		Member memberPark = new Member(103, "¹Ú¼ö");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberPark);

		memberHashMap.showAllMember();
		
		//bruce lee is gone
		memberHashMap.removeMember(102);
		memberHashMap.showAllMember();
	}

}

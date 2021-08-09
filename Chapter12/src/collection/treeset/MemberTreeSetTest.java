package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member memberLee = new Member(101, "ÀÌÁöÀº");
		Member memberKim = new Member(102, "±èÄÚ¸ä");
		Member memberKang = new Member(103, "°­°¨Âù");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showAll();
		
	}

}

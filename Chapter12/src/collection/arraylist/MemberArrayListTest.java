package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "ÀÌÁöÀº");
		Member memberKim = new Member(102, "±èÄÚ¸ä");
		Member memberKang = new Member(103, "°­°¨Âù");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAll();
	}

}

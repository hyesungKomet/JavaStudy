package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(102, "ÀÌ¼Ò·æ");
		Member memberKim = new Member(101, "±èÄÚ¸ä");
		Member memberPark = new Member(103, "¹Ú¼ö");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberPark);

		memberTreeMap.showAllMember();
		
		//bruce lee is gone
		memberTreeMap.removeMember(102);
		memberTreeMap.showAllMember();
	}

}

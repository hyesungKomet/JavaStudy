package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(102, "�̼ҷ�");
		Member memberKim = new Member(101, "���ڸ�");
		Member memberPark = new Member(103, "�ڼ�");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberPark);

		memberTreeMap.showAllMember();
		
		//bruce lee is gone
		memberTreeMap.removeMember(102);
		memberTreeMap.showAllMember();
	}

}

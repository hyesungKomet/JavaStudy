package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "이지은");
		Member memberKim = new Member(102, "김코멧");
		Member memberKang = new Member(103, "강감찬");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showAll();
		//원래 id가 같으면 중복 허용 안되는데 되네? 왜그럴까?
		//String class에 equals가 구현되어있다
		//같은지를 체크하는건데, 이를 구현해야
		//중복여부를 체크할 수 있다
		//Member.java에서 equals를 overriding하여
		//이제는 중복여부 체크 가능!
		Member memberLee2 = new Member(101, "이소룡");
		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll();
	}

}

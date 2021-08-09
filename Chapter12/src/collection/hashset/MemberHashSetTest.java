package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "������");
		Member memberKim = new Member(102, "���ڸ�");
		Member memberKang = new Member(103, "������");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showAll();
		//���� id�� ������ �ߺ� ��� �ȵǴµ� �ǳ�? �ֱ׷���?
		//String class�� equals�� �����Ǿ��ִ�
		//�������� üũ�ϴ°ǵ�, �̸� �����ؾ�
		//�ߺ����θ� üũ�� �� �ִ�
		//Member.java���� equals�� overriding�Ͽ�
		//������ �ߺ����� üũ ����!
		Member memberLee2 = new Member(101, "�̼ҷ�");
		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll();
	}

}

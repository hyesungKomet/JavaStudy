//set interface
//collection's child interface
//get(i) not working
//duplication not allowed
//no order

package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");//true
		
		System.out.println(b1);
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		//순서대로 나오지 않을 수도 있다
		
		System.out.println(set);
		
		set.add("aaa");
		System.out.println(set);
		boolean b = set.add("aaa");
		System.out.println(b);//false
		//중복 안됨
		
	}

}

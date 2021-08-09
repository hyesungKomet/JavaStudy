package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		//정렬이 되어서 나온다
		//Comparable이 String에서 이미 구현되어있음
		//Member에는 이게 구현되어있지 않아서 오류발생
		System.out.println(tree);
	}

}

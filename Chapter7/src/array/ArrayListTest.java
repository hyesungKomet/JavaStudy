package array;

import java.util.ArrayList;//import 해줘야함!!

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(String s:list) {
			System.out.println(s);
		}
		//위의 for문과 같은 의미(출력)
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}

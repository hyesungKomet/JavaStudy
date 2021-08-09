package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Kim");
		sList.add("James");
		sList.add("Comet");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		//위의 forEach와 같은 표현
		/*
		for(String s: sList) {
			System.out.println(s);
		}*/
		
		//sorting되어 오름차순으로 출력됨
		sList.stream().sorted().forEach(s->System.out.println(s));
		
	}

}

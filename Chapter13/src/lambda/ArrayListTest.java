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
		//���� forEach�� ���� ǥ��
		/*
		for(String s: sList) {
			System.out.println(s);
		}*/
		
		//sorting�Ǿ� ������������ ��µ�
		sList.stream().sorted().forEach(s->System.out.println(s));
		
	}

}

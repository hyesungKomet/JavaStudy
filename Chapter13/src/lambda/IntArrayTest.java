package lambda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		//에러 발생 - 이미 stream을 썼기에소모됨
		//따라서 다시 생성해주어야 함
		int count = (int)stream.count();
	}
}

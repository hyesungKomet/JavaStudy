package lambda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		//���� �߻� - �̹� stream�� ��⿡�Ҹ��
		//���� �ٽ� �������־�� ��
		int count = (int)stream.count();
	}
}

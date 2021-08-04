package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[] {0,1,2};//초기화되는 만큼 메모리 생성
		int[] numbers2 = {0,1,2}; //이렇게도 가능
		int[] num3 = new int[5]; //다 0으로 초기화됨
		System.out.println(numbers.length);
		
		numbers2[0] = 4;
		numbers2[1] = 5;
		numbers2[2] = 6;
		
		for(int i=0;i<numbers2.length;i++) {
			System.out.println(numbers2[i]);
		}
		for(int i=0;i<num3.length;i++) {
			System.out.println(num3[i]);
		}
	}

}

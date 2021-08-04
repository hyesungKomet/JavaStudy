package array;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		System.out.println(arr.length); //6이 아니라 행의 길이인 2를 출력한다
		System.out.println(arr[0].length);//행 0을 기준으로 길이가 3인 일차원 배열이기에 3을 출력
		
		int[][] arr2 = {{1,2,3}, {4,5,6}};//2중 for문으로 출력
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
		//알파벳 13개씩 두줄 출력하려면 alphabet을 [13][2]로 만들면 좋겠죠? 해보기!!
	}
}

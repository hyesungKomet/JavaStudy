package array;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		System.out.println(arr.length); //6�� �ƴ϶� ���� ������ 2�� ����Ѵ�
		System.out.println(arr[0].length);//�� 0�� �������� ���̰� 3�� ������ �迭�̱⿡ 3�� ���
		
		int[][] arr2 = {{1,2,3}, {4,5,6}};//2�� for������ ���
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
		//���ĺ� 13���� ���� ����Ϸ��� alphabet�� [13][2]�� ����� ������? �غ���!!
	}
}

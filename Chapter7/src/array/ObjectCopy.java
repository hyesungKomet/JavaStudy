package array;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];//���������
		Book[] bookArr3 = new Book[3];
		
		bookArr1[0] = new Book("�¹���1", "������");
		bookArr1[1] = new Book("�¹���2", "������");
		bookArr1[2] = new Book("�¹���3", "������");
		
		bookArr3[0] = new Book();
		bookArr3[1] = new Book();
		bookArr3[2] = new Book();
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);//���� ����(�ּҺ���)
		//bookArr1�� �ٲ�� bookArr2�� �ٲ�(�ּҰ� ����Ȱſ��� �ٲ� ���� bookArr2�� ����Ų��)
		
		for(int i=0; i< bookArr2.length;i++) {//��������
			//System.out.println(bookArr2[i]);
			bookArr2[i].showBookInfo();
		}
		
		//��������
		for(int i=0; i<bookArr3.length;i++) {
			bookArr3[i].setAuthor(bookArr1[i].getAuthor());
			bookArr3[i].setBookName(bookArr1[i].getBookName());
		}
		
		bookArr1[0].setAuthor("����");
		bookArr1[0].setBookName("�ڿϼ�");
		
		
		
		for(int i=0; i< bookArr1.length;i++) {
			//System.out.println(bookArr2[i]);
			bookArr1[i].showBookInfo();
		}
		//��������
		for(int i=0; i< bookArr2.length;i++) {
			//System.out.println(bookArr2[i]);
			bookArr2[i].showBookInfo();
		}
		
		//�������� - �ν��Ͻ� ���� �����⿡ arr1�� ��ȭ�� arr3�� ������ ��ġ�� ����
		for(int i=0; i< bookArr3.length;i++) {
			//System.out.println(bookArr2[i]);
			bookArr3[i].showBookInfo();
		}
		
		
		//enhanced for loop - ��ü �迭�� ��ȸ�� �� ����ϸ� ����
		String[] strArr = {"Java", "Android", "c"};
		for(String s:strArr) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num:arr) {
			System.out.println(num);
		}
	}
}

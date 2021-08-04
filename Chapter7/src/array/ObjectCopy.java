package array;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];//앝은복사용
		Book[] bookArr3 = new Book[3];
		
		bookArr1[0] = new Book("태백산맥1", "조정래");
		bookArr1[1] = new Book("태백산맥2", "조정래");
		bookArr1[2] = new Book("태백산맥3", "조정래");
		
		bookArr3[0] = new Book();
		bookArr3[1] = new Book();
		bookArr3[2] = new Book();
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);//얕은 복사(주소복사)
		//bookArr1이 바뀌면 bookArr2도 바뀜(주소가 복사된거여서 바뀐 값을 bookArr2도 가르킨다)
		
		for(int i=0; i< bookArr2.length;i++) {//얕은복사
			//System.out.println(bookArr2[i]);
			bookArr2[i].showBookInfo();
		}
		
		//깊은복사
		for(int i=0; i<bookArr3.length;i++) {
			bookArr3[i].setAuthor(bookArr1[i].getAuthor());
			bookArr3[i].setBookName(bookArr1[i].getBookName());
		}
		
		bookArr1[0].setAuthor("나목");
		bookArr1[0].setBookName("박완서");
		
		
		
		for(int i=0; i< bookArr1.length;i++) {
			//System.out.println(bookArr2[i]);
			bookArr1[i].showBookInfo();
		}
		//얕은복사
		for(int i=0; i< bookArr2.length;i++) {
			//System.out.println(bookArr2[i]);
			bookArr2[i].showBookInfo();
		}
		
		//깊은복사 - 인스턴스 따로 잡혔기에 arr1의 변화가 arr3에 영향을 미치진 않음
		for(int i=0; i< bookArr3.length;i++) {
			//System.out.println(bookArr2[i]);
			bookArr3[i].showBookInfo();
		}
		
		
		//enhanced for loop - 전체 배열을 순회할 때 사용하면 편함
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

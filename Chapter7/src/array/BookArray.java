package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];//객체 배열 생성
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
			//null * 5
			//책을 가르킬 주소가 5개 생성됨 - 이제 각 인스턴스를 주소에 넣어줘야함
		}
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i = 0;i<library.length;i++) {
			System.out.println(library[i]); //주소값
		}
		
		for(int i = 0;i<library.length;i++) {
			library[i].showBookInfo(); //각 요소(메소드) 꺼내서 출력
		}
	}

}

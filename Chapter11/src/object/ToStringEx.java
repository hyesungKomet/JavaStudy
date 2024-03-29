//toString() 메서드: 객체 정보를 문자열로 바꾸어주는 메서드

package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	//toString같은 Object의 메소드 재정의 가능!!
	@Override
	public String toString() {
		return title + ","+author;
	}
}


public class ToStringEx {
	
	public static void main(String[] args) {
		
		Book book = new Book("두잇자바", "코멧");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
		//String에는 toString이 재정의되어있다
	}
}

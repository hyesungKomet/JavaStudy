//toString() �޼���: ��ü ������ ���ڿ��� �ٲپ��ִ� �޼���

package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	//toString���� Object�� �޼ҵ� ������ ����!!
	@Override
	public String toString() {
		return title + ","+author;
	}
}


public class ToStringEx {
	
	public static void main(String[] args) {
		
		Book book = new Book("�����ڹ�", "�ڸ�");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
		//String���� toString�� �����ǵǾ��ִ�
	}
}
package bookshelf;

import java.util.ArrayList;

public class Shelf {//선반
	//protected는 상속받은 클래스에서 쓸 수 있다
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}

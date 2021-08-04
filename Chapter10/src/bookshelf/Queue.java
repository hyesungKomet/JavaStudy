package bookshelf;

public interface Queue {
	
	void enQueue(String title);
	String dequeue();
	int getSize();
}

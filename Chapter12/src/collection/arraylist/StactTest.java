package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
		
		return arrayStack.remove(len - 1);
	} 
	//peek은 맨 위에 요소를 꺼내보는 것
	//pop과 다르게 remove대신get을 써서
	//요소가 지워지지은 않는다
	public String peek() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
		
		return arrayStack.get(len - 1);
	}
}
public class StactTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//없는데 pop하면 스택 언더플로우
	}

}

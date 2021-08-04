package helloworld;

public class Operation {

	public static void main(String[] args) {
		int num = 5; // 00000101
		
		System.out.println(num << 1);//10
		System.out.println(num);
		System.out.println(num << 2);//20
		System.out.println(num << 3);//40
		
		System.out.println(num >> 1);//2 0000 0010
	}

}

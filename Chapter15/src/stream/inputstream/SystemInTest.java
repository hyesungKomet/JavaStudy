package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나 쓰고 엔터");
		int i=0;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i);
			};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

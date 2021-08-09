package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			//파일이 없어서 에러 발생
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
			//닫으려는 파일이 없어서 에러 발생
			fis.close();
			} catch(IOException e) {
				System.out.println(e);
			}
			System.out.println("finally");
		}
		System.out.println("end");
		
	}
}

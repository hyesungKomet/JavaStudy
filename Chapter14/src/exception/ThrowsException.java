package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		
		//Class not found exception
		Class c = Class.forName(className);
		return c;
	
	}
	public static void main(String[] args) {
		
		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.string");
		} 
		//Exception 최상위 클래스를 먼저 써버리면
		//모든 예외가 여기서 걸려서 아래의 예외처리가
		//에러발생함 - 맨 하단에 써주기!
		/*
		catch(Exception e) {
			System.out.println(e);
		}*/
		catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		//end도 출력되기에 중간에 죽은건 아니다
		System.out.println("end");
	}
}

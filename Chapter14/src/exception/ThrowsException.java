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
		//Exception �ֻ��� Ŭ������ ���� �������
		//��� ���ܰ� ���⼭ �ɷ��� �Ʒ��� ����ó����
		//�����߻��� - �� �ϴܿ� ���ֱ�!
		/*
		catch(Exception e) {
			System.out.println(e);
		}*/
		catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		//end�� ��µǱ⿡ �߰��� ������ �ƴϴ�
		System.out.println("end");
	}
}

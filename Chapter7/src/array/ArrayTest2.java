package array;



public class ArrayTest2 {
	public static void main(String[] args) {//쉽지 이건ㅋ
		char[] alphabets = new char[26];
		char ch = 'A'; //65
		
		for(int i=0;i<alphabets.length;i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i=0;i<alphabets.length;i++, ch++) {
			System.out.println(alphabets[i]);
		}
		System.out.println(alphabets);
	}
	
}

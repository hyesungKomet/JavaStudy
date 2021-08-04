package helloworld;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);//1000
		System.out.println(bNum);//-24 -128<byte<127
		
		double dNum = 3.14;
		iNum = (int)dNum;
		
		System.out.println(iNum);//3
	}

}

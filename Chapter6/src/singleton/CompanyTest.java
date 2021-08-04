package singleton;

import java.util.Calendar;

public class CompanyTest {
	public static void main(String[] args) {
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company);
		System.out.println(company2);//같게나온다!
		
		
		Calendar cal = Calendar.getInstance(); //이런것도 getInstance만 가능
	}
}

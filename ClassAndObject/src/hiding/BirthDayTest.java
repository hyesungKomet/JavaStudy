package hiding;

class BirthDay {
	private int day;	//public이었을 때는 괜찮은데
	private int month;	//private쓰니까 클래스 안에서만 작동해서 오류발생
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		
		if(month == 2) {
			if(day <1 || day > 28) {
				System.out.println("날짜 오류입니다");
			}
			
		}
		else {
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

public class BirthDayTest{//java파일이랑 이름 같아야 함
	public static void main(String args) {
		BirthDay day = new BirthDay();
		
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2018);
	}
}
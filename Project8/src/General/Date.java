package General;


public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Date(String date) {
		String s[]=date.split("/");
		int d=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
		int y=Integer.parseInt(s[2]);
		checkDate(d,m,y);
		
	}
	void checkDate(int d, int m,int y) {
		if(d>0 && d<32)
			this.day=d;
		else
			this.day=1;
		if(m>0 && m<13)
			this.month=m;
		else
			this.month=1;
		if(y>2000)
			this.year=y;
		else
			this.year=2000;		
	}
	void setDay(int day) {
		this.day=day;
	}
	void setMonth(int month) {
		this.month=month;
	}
	void setYear(int year) {
		this.year=year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	void appointment() {
		
	}
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
	}

}

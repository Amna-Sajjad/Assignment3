package General;

public class Time {
	private int hours;
	private int min;
	private String duration;
	public Time(int hours,int min,String duration){
		this.hours=hours;
		this.min=min;
		this.duration=duration;
	}
	public Time(String time) {
		String s[]=time.split(":");
		String s1[]=s[1].split(" ");
		int h=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s1[0]);
		String du=s1[1];
		checkTime(h,m,du);
	}
	void checkTime(int h,int m,String du) {
		if(h>0&&h<13)
			this.hours=h;
		else
			this.hours=1;
		if(m>=0&&m<60)
			this.min=m;
		else
			this.min=0;
		if(du.compareTo("AM")==0||du.compareTo("PM")==0)
			this.duration=du;
		else
			this.duration="AM";
	}
	void setHours(int hours) {
		this.hours=hours;
	}
	void setMin(int min) {
		this.min=min;
	}
	void setDuration(String duration) {
		this.duration=duration;
	}
	int getHours() {
		return hours;
	}
	int getMin() {
		return min;
	}
	String getDuration() {
		return duration;
	}
	public String toString() {
		if(min==0)
			return this.hours+":"+this.min+"0 "+this.duration;
		else
			return this.hours+":"+this.min+" "+this.duration;
	}

}

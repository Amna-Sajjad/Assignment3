package Hospital;
import General.*;

public class OutdoorPatient extends Patient {
	private Date apDate;
	private Time apTime;
	private Doctor doc;
	private int fee;
	OutdoorPatient(String name,String address,long cnic,long phone,int age,char gender,int fee,String date,String time,Doctor doctor){
		super(name,address,cnic,phone,age,gender);
		apDate=new Date(date);
		apTime=new Time(time);
		this.fee=fee;
		this.doc=doctor;
	}
	public void setFee(int fee) {
		this.fee=fee;
	}
	public int getFee() {
		return fee;
	}
	public Date getDate() {
		return apDate;
	}
	Doctor getDoctor() {
		return doc;
	}
	void setDate(Date date) {
		apDate=date;
	}
	void setTime(Time time) {
		apTime=time;
	}
	public String toString() {
		return "Outdoor "+super.toString()+" treated by "+doc+" on "+apDate+" at "+apTime;
	}

}

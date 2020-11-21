package Hospital;
import General.*;
//import General.Date;
public class IndoorPatient extends Patient {
	private int wardNo,roomNo,bedNo,fee;
	private Doctor doc;
	private Date adDate;
	public IndoorPatient(String name,String address,long cnic,long phone,int age,char gender,int wn,int bn,int rn,int fee,String date,Doctor doctor){
		super(name,address,cnic,phone,age,gender);
		wardNo=wn;
		roomNo=bn;
		bedNo=rn;
		this.fee=fee;
		adDate=new Date(date);
		this.doc=doctor;
	}
	public void setFee(int fee) {
		this.fee=fee;
	}
	public int getFee() {
		return fee;
	}
	public void setWardNo(int wardNo) {
		this.wardNo=wardNo;
	}
	public int getWardNo() {
		return wardNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo=roomNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setBedmNo(int bedNo) {
		this.bedNo=bedNo;
	}
	public int getBedNo() {
		return bedNo;
	}
	Date getDate()
	{
		return adDate;
	}
	Doctor getDoctor() {
		return doc;
	}
	void setDate(Date date)
	{
		adDate=date;
	}
	void setTime(Time time)
	{
	}
	public String toString() {
		return "Indoor "+
	super.toString()+" treated by "+doc+" on "+adDate;
	}

}

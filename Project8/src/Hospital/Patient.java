package Hospital;
import General.*;
public abstract class Patient {
	private String name,address;
	private long cnic,phone;
	private int age;
	private char gender;
	public Patient(){
		this.name="";
		this.address="";
		this.cnic=0;
		this.phone=0;
		this.age=0;
		this.gender='O';
	}
	public Patient(String name,String address,long cnic,long phone,int age,char gender){
		this.name=name;
		this.address=address;
		this.cnic=cnic;
		this.phone=phone;
		this.age=age;
		this.gender=gender;
	}
	void setAddress(String address) {
		this.address=address;
	}
	void setPhone(long phone) {
		this.phone=phone;
	}
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
	long getCNIC() {
		return cnic;
	}
	long getPhone() {
		return phone;
	}
	int getAge() {
		return age;
	}
	char getGender() {
		return gender;
	}
	abstract Date getDate(); 
	abstract Doctor getDoctor();
	abstract void setDate(Date date);
	abstract void setTime(Time time);
	public String toString() {
		return "Patient: "+name+" ( "+gender+" ) "+age+" years old";
	}

}

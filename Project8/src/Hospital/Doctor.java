package Hospital;

public class Doctor {
	private String name,department,specialization;
	private long cnic,phone;
	private char gender;
	public Doctor(String name,String department,String specialization,long cnic,long phone,char gender){
		this.name=name;
		this.department=department;
		this.specialization=specialization;
		this.cnic=cnic;
		this.phone=phone;
		this.gender=gender;
	}
	public Doctor(Doctor doctor) {
		this.name=doctor.name;
		this.department=doctor.department;
		this.specialization=doctor.specialization;
		this.cnic=doctor.cnic;
		this.phone=doctor.phone;
		this.gender=doctor.gender;
	}
	void setDepartment(String department) {
		this.department=department;
	}
	void setSpecialization(String specialization) {
		this.specialization=specialization;
	}
	void setPhone(long phone) {
		this.phone=phone;
	}
	String getName() {
		return name;
	}
	String getDepartment() {
		return department;
	}
	String getSpecialization() {
		return specialization;
	}
	long getCNIC() {
		return cnic;
	}
	long getPhone() {
		return phone;
	}
	char getGender() {
		return gender;
	}
	public String toString() {
		return "Doctor "+name+" ( "+gender+" ) "+specialization+" in "+department;
	}

}

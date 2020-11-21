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
		return "Doctor "+name+" ( "+gender+" ) have specialization in "+specialization;
	}

}

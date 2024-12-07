package com.STK.JFSD_HQL;

//public class Student 
//{
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="Stud1")
	public class Student {
	    @Id
	    private int sid;
	    private String sname;
	    private String gender;
	    private String department;
	    private String program;
	    private String dateOfBirth;
	    private String contactNumber;
	    private String graduationStatus;
	    private double cgpa;
	    private int numberOfBacklogs;

	    public String toString() {
	        return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", department=" + department
	                + ", program=" + program + ", dateOfBirth=" + dateOfBirth + ", contactNumber=" + contactNumber
	                + ", graduationStatus=" + graduationStatus + ", cgpa=" + cgpa + ", numberOfBacklogs=" + numberOfBacklogs + "]";
	    }

	    // Getters and setters for all fields
	    public int getSid() {
	        return sid;
	    }

	    public void setSid(int sid) {
	        this.sid = sid;
	    }

	    public String getSname() {
	        return sname;
	    }

	    public void setSname(String sname) {
	        this.sname = sname;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public String getProgram() {
	        return program;
	    }

	    public void setProgram(String program) {
	        this.program = program;
	    }

	    public String getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(String dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public String getContactNumber() {
	        return contactNumber;
	    }

	    public void setContactNumber(String contactNumber) {
	        this.contactNumber = contactNumber;
	    }

	    public String getGraduationStatus() {
	        return graduationStatus;
	    }

	    public void setGraduationStatus(String graduationStatus) {
	        this.graduationStatus = graduationStatus;
	    }

	    public double getCgpa() {
	        return cgpa;
	    }

	    public void setCgpa(double cgpa) {
	        this.cgpa = cgpa;
	    }

	    public int getNumberOfBacklogs() {
	        return numberOfBacklogs;
	    }

	    public void setNumberOfBacklogs(int numberOfBacklogs) {
	        this.numberOfBacklogs = numberOfBacklogs;
	    }
	}
//}

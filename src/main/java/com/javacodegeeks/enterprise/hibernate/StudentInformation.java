package com.javacodegeeks.enterprise.hibernate;

import java.util.Date;

public class StudentInformation {
	
	private Integer studentId;
	private String address;
	private String registryNumber;
	private String phoneNumber;
	private Date enlisted;
	
	private Student student;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegistryNumber() {
		return registryNumber;
	}

	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getEnlisted() {
		return enlisted;
	}

	public void setEnlisted(Date enlisted) {
		this.enlisted = enlisted;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}

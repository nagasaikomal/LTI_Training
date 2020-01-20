package com.lti.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="singleton")
public class Student {
		private int rollNumber;
		private String studentName;
		private double studentScore;
		@Autowired
		//@Qualifier("address1")
		private Address address;//=new Address();
		
		public Student(){
			super();
			System.out.println("--- Student() ---");
		}
		
		public Student(int rollNumber, String studentName, double studentScore) {
			super();
			System.out.println("--- Student(-,-,-) ---");
			this.rollNumber = rollNumber;
			this.studentName = studentName;
			this.studentScore = studentScore;
		}

		public int getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public double getStudentScore() {
			return studentScore;
		}

		public void setStudentScore(double studentScore) {
			this.studentScore = studentScore;
		}

		@Override
		public String toString() {
			return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentScore="
					+ studentScore + "]";
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
		@PostConstruct
		public void postConstruct(){
			System.out.println("@PostConstruct method");
		}
		@PreDestroy
		public void preDestroy(){
			System.out.println("@PreDestroy method");
			
		}

}

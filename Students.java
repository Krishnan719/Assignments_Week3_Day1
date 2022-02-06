package org.student;

public class Students {
	public void getStudentInfo() {
		System.out.println("Method without arguments");
	}
	public void getStudentInfo(int id) {
		System.out.println("Id argument passed in the method");
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Id and Name arguments passed in the method");
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Email and Phone Number arguments passed in the method");
	}
	public static void main(String[] args) {
		Students students = new Students();
		students.getStudentInfo();
		students.getStudentInfo(7);
		students.getStudentInfo(8, "Krishnan");
		students.getStudentInfo("krishnank8@gmail.com", 8939226606L);
	}
}
package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Name of the student is Krishnan");
	} 
	public void studentDept() {
		System.out.println("Student department is Electrical & Electronics Engineering");
	}
	public void studentId() {
		System.out.println("Student ID is 30");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentDept();
		student.studentId();
		student.studentName();
	}
}
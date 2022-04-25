package org.student;

import org.department.Department;

public class Students extends Department{

	public void studentName()
	{
		System.out.println("studentName");	
	}
	
	public void studentDept()
	{
		System.out.println("studentDept");
	}
	
	public void studentId()
	{
		System.out.println("studentId");
	}
	
	public static void main(String[] args) {
	
		Students st = new Students();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
		
	}
	
}

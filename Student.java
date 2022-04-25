package student;

public class Student {
	
	
	public void getStudentInfo(int id)
	{
		System.out.println("ID of student is:"+id);
	}
	
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("ID2 of student is:"+id+ "name of student is:"+ name);
	}

	
	public void getStudentInfo(String email, int phoneNumber)
	{
		System.out.println("email of student is:"+email+ "name of student is:"+ phoneNumber);
	}


	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.getStudentInfo(10001);
		st.getStudentInfo(10002, "shima");
		st.getStudentInfo("r@gmail.com", 739740);
		
		
		
	

	}

}

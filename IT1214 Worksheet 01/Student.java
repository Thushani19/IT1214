class Student{
	private String name;
	private String rollNo;
	private String course;
	
	Student(String name,String rollNo,String course)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getRollNo()
	{
		return rollNo;
	}
	
	public void setRollNo(String rollNo)
	{
		this.rollNo = rollNo;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
		System.out.println("Course: "+course);
	}
}
	
	/*
	public class Tester
	{
		public static void main(String[] args)
		{
			Student student = new Student("Jone Doe","2025/ICT/101","Information Technology");
			student.display();
		}	
		
	}
	*/

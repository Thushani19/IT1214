class AllInOneDemo{
	static void print(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args)
	{
		Student s1=new Student("Siva");
		Student s2=new Student();
		Student s3=new Student("Shakthy",75);
		
		print("Name of the Student s1 is "+s1.name+" , Marks = "+s1.marks);
		print("Name of the Student s2 is "+s2.name+" , Marks = "+s1.marks);
		print("Name of the Student s3 is "+s3.name+" , Marks = "+s1.marks);
		print("Name of the Student s3 is "+s3.name+" , Marks = "+s3.marks);
	}
}
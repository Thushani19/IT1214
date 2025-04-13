class Student
{
	String name="Adam";
	int marks=100;
	
	Student()
	{
		name="noname";
	}
	
	Student (String n)
	{
		name=n;
	}	

	Student(String n,int m)
	{
		name=n;
		marks=m;
	}		
}

/*
class TestClass{
	int a;
	public static void main(String[] args){
		System.out.println("Hi from TestClass Class");
	}
	
}
*/

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi from StudentDemo Class");
		System.out.println("Creating an object of Student Class");
		
		//Student s1=new Student();  //s1 is a student object.
		//Student s1=new Student("NiceName");
		Student s1=new Student("NiceName",85);
		System.out.println("Creating an object of Student Class");
		
		System.out.println("Name value of the  object is "+ s1.name );
		System.out.println("marks value of the  object is "+ s1.marks );
		s1.name="Bob"; //setting the variable value
		s1.marks=10;
		
		System.out.println("Name value of the  object is "+ s1.name );
		System.out.println("marks value of the  object is "+ s1.marks );
	}
}

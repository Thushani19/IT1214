class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student Object");
		name="Default Name";
	}
	
	Student(String n,int m){
		System.out.println("Creating a Student Object with name "+n+" and marks "+m);
		name="Default Name";
	}
	
}

class Printer{
	void print(String s){
		System.out.println(s);
	}
}


class App{
	public static void main(String[] args){
		System.out.println("Welcome to Demo Class App");
		//Printer p=new Printer();
		//p.print("Display Demo Class App");

	Student st1=new Student();
	st1.marks=100;
	System.out.println("Name of the Student st1 is "+st1.name+" for "+st1.marks);
	
	st1.name="Siva";
	System.out.println("Marks of "+st1.name+" for "+st1.marks);
	System.out.println("Name of the Student st1 is "+st1.name+" for "+st1.marks);
	//p.print("Name of the Student st1 is "+st1.name+" for "+st1.marks);
	
	Student st2=new Student();
	st2.marks=90;
	st2.name="Isha";
	System.out.println("Name of the Student st2 is "+st2.name+" for "+st2.marks);
	
	
	Student st3=new Student("Shakthy",80);
	System.out.println("Name of the Student st3 is "+st3.name+" for "+st3.marks);
	
	}
	
}
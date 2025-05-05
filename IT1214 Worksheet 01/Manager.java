class Employee
{
	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
}

class Manager extends Employee
{
	Manager(String name, int id, double salary)
	{
		super(name, id, salary);
	}
	@Override
	void display()
	{
		super.display();
		System.out.println("Role: Manager");
	}
}
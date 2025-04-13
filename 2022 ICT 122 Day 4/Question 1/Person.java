class Person
{
	private String name;
	
	public String getName()
	{
		return name;		
	}
	
	public void setName(String newName){
		this.name=newName;
	}
	
}

class Main
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.setName("siva");
		System.out.println(p1.getName());
	}		
	
}
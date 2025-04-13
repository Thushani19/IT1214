class Car{
	private String model;
	
public String getModel(){
	return model;
	}
public void setModel(String newModel){
	this.model=newModel;
}
}
public class Car1
{
	public static void main(String args[])
	{
		Car Obj1=new Car();
		Obj1.setModel("Toyota Corolla");
		System.out.println(Obj1.getModel());
	}
}

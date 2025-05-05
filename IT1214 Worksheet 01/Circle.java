class Shape
{
	void area()
	{
		System.out.println("Area not defined");
	}
}

class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	@Override
	void area()
	{
		System.out.println("Area of Circle: "+(Math.PI * radius * radius));
	}
}
class Rectangle
{
	private int length;
	private int breadth;
	
	Rectangle()
	{
		length = 0;
		breadth = 0;
	}
	
	Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;	
	}
	
	public int area()
	{
		return length * breadth;
	}
}
	
	/*
	public class Tester
	{
		public static void main(String[] args)
		{
			Rectangle rect1 = new Rectangle();
			Rectangle rect2 = new Rectangle(5,10);
			System.out.println("Area of rect2: "+rect2.area());
		}
	}
	*/



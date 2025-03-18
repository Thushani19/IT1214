class One
{
	int a=10;
	int b;
	
	void printDetails()
	{
		System.out.println("Fron Class One a ="+a);
		System.out.println("Fron Class One b ="+b);
	}
}

class Two
{
	int a,c;
	void printDetails()
	{
		System.out.println("Fron Class Two a ="+a);
		System.out.println("Fron Class Two c ="+c);
	}
}

class App
{
	public static void main (String args[])
	{
		One o1=new One();
		Two t1=new Two();
		
		o1.printDetails();
		o1.b=50;
		o1.printDetails();
		t1.printDetails();
		t1.a=10;
		t1.c=30;
		t1.printDetails();
	}
}
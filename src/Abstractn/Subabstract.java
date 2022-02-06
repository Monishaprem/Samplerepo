package Abstractn;

public class Subabstract extends Sampleabstract
{
	void print()
	{
		System.out.println("Abstract method");
		System.out.println("Abstract method");
	}
	public static void main(String args[])
	{
		Subabstract obj=new Subabstract();
		obj.print();
	}

}

package Interface;

public class SubInterface implements SampleInterface
{
	public void display()
	{
		System.out.println("Abstract methos");
	}
	public void add()
	{
		System.out.println("Non abstact method");
	}
	public void locmethod()
	{
		System.out.println("Local method of this class");
	}
	


	public static void main(String args[])
	{
		//SubInterface ob=new SubInterface();
		SampleInterface xz=new SubInterface();
		
	
		xz.display();
		xz.add();
		//xz.locmethod();
		System.out.println(xz.a);
		System.out.println(xz.b);
	}

}

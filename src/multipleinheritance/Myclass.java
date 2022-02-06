package multipleinheritance;

public class Myclass implements Sample1Inter,sample2inter
{
	public void display()
	{
		System.out.println("Method Interface1");
	}
	
	public void show()
	{
		System.out.println("Method Interface2");
	}
	
	
	public static void main(String[] args) 
	{
		Myclass ob=new Myclass();
		ob.display();
		ob.show();

	}

}

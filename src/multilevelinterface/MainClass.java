//Only for conditn one interface can be implemented//Multilevel interface

package multilevelinterface;


public class MainClass implements Interface2
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
		Interface2 ob=new MainClass();
		ob.display();
		ob.show();

	}

}

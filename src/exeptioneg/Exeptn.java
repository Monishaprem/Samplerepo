package exeptioneg;

public class Exeptn 
{

	
	public void diplay()
	{
		int a=20;
		try
		{
		int b=a/0;
		System.out.println(b);
		}
		
		catch(Exception c)  //Handle exception 
		{
			System.out.println("Exeption handled");
			System.out.println(c);
			
		}
		finally //To knw exception is handled or not
		{
			System.out.println("Fianlly block");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Exeptn ob=new Exeptn();
		//System.out.println("End of statement");// It will print bcos it is b4 exeption triggers 
		ob.diplay();
		System.out.println("End of statement");// Will not execute bcos exeption triggered in 19th line

	}

}

package hirarchialInher;



public class ChildA extends Parent1 {
	
	 void sub()
	 {
		 int d=a-b;
		 System.out.println("C="+d);
	 }
	 public static void main(String args[]) 
		{
			ChildA ob2= new ChildA();
			
			ob2.sub();
			ob2.display();
		}

}

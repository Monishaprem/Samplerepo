package Encap;

public class Fullencapsulation
{
	private String name;
	private int age;
	
	void setter(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void getter()
	{
		System.out.println(name);
		age=age*2;
		System.out.println(age);
	}
	
	}
	



package Firstprogram;

public class Callbyreference 
{

	public Callreference m()
	{
		return new Callreference();
	
	}
	
	public static void main(String[] args)
	{
	
		Callbyreference obj=new Callbyreference();	//object creation
		
		/*obj.m();
		obj.m().method1();
		String obj1=obj.m().method1();*/
		
		String obj1=obj.m().method1();
		System.out.println(obj1);
		
		
		double obj2=obj.m().method2();
		System.out.println(obj2);
		 
		
	}

}

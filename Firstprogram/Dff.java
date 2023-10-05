package Firstprogram;

public class Dff {

public String Car()
{
	return "NEW CAR";
}
public float Car1()
{
	return 123;
}
	
public int car3(int a, int b)

{
	
	return a+b;
}
	public char car4()
	{
	return 'V';
	}
	
	public static void main(String[] args) 
	{
	Dff x =new Dff();

	float y = x.Car1();
    System.out.println(y);	 
    
    char z =x.car4();
    System.out.println(z);
    
   int a = x.car3(20, 80);
   System.out.println(a);
	}

}


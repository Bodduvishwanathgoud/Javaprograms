package Firstprogram;

public class Differentclass 
{

	public String Book()
	{
		return "page";
	}
	
public float Book1()
{
	
return 123;
}

public int  Book2(int a,int b, int c)
{
 return a+b+c;   
	}
  public char Book3()
  {
	  return 'A';
	  
  }
 public static void main(String[] args) 
 {
	 Differentclass obj = new Differentclass();
	 String x = obj.Book();
	 System.out.println(x);
	 
	 int y = obj.Book2(10, 20, 30);
	 System.out.println(y);
	 
	 char z = obj.Book3();
	 System.out.println(z);
	 
	 float s = obj.Book1();
	 System.out.println(s);
	 
	 
}

	
}

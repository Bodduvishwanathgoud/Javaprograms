package Firstprogram;

public class Methodparameters {
public void method1 (String gmail)
{
	System.out.println(gmail);
}
public void method2 (int Phoneno)
{
	System.out.println(Phoneno);
}
public void method3 (char Facebook)
{
	System.out.println(Facebook);
}
public void method4(boolean value)
{
	System.out.println(value);
}

public void method5(int x,String name, int rollno, char sec, boolean value)
{
	System.out.println(x+name+rollno+sec+value);
	
}
public static void main (String args[])
{
	Methodparameters obj=new Methodparameters();
	obj.method1("kumar123@gmail.com");
	obj.method2(76567);
	obj.method3('A');
	obj.method4(true);
	
	
	obj .method5(1,"vishwa", 304,  'A', true);
}

}

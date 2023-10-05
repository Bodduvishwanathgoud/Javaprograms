package Firstprogram;

public class Varibletypes {
	int x=400;
	int y=800;
	String mobile="98765433210";
	
	
public void firstmethod()
{
	int a=200;
	int m=x+y;
	System.out.println(m);

}
public void secondmethod() 
{
	int e=100;
	System.out.println(e);
}

public static void main(String[] args) {
	
	 
	 Varibletypes obj=new Varibletypes();
	 obj.firstmethod();
	 obj.secondmethod();
	 int phone=obj.x;
	 int two=obj.y;
	 System.out.println(phone);
	 System.out.println(two);
	 String uht=obj.mobile;
	 System.out.println(uht);
	 	 
}

}


package Firstprogram;

public class constructorparameters {
	int a;
	int b;

	public constructorparameters(int x,int y) {
 a=x;
 b=y;
	}
public void override1()
{
	System.out.println(a*b);
	System.out.println(a+b);
}
public static void main(String[] args) {
	new constructorparameters(20, 30).override1();
}
}

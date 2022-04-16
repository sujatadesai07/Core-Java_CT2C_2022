package Day2;

class A	 //super class
{
	public void m1()
	{
		System.out.println("Hello Everyone..!");
	}
}
class B extends A  //subclass
{
	public void m2()
	{
		System.out.println("Welcome to C2TC Training");
	}

	public void m1()  //overriding
	{
		System.out.println("Day 2");
	}
	public void area(String a, int f)
	{
		//area of a circle
	}
	public void area(int a, String c, float b)
	
	{
		//area of rectangle
	}
	}
public class C {

	public static void main(String[] args) {
		A a,a1; //abstract datatype
		B b;
		int i=1, j; //primitive datatype
		a=new A();
		a.m1();


	}

}

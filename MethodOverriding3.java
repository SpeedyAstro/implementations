class A
{
	void show(int a)
	{
		System.out.println("class a:" +a);
	}
}
class B extends A
{
	void show(int a)
	{
		System.out.println("class b: " +a);
	}
}
class MethodOverriding3
{
	public static void main(String[] args)
	{
		A ob3=new B();
		ob3.show(20);
	}
}
/*
 * output
 * class b : 20
 */
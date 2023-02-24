class Test
{
	void display(Object a)
	{
		System.out.println("Object method");
	}
	void display(String a)
	{
		System.out.println("String method");
	}
	void display(StringBuilder a)
	{
		System.out.println("String Builder method");
	}
}
class MethodOverloading9
{
	public static void main(String[] args)
	{
		Test t=new Test();

		//t.display(null);		

		t.display("deepak");
		t.display(new StringBuilder("amit"));

		Object o=new Object();
		t.display(o);
	}
}

/*
 * Output -
 * String method
 * String Builder method
 * Object method
 */
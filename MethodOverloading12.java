class MethodOverloading12
{
	public static void main(String[] args)
	{
		System.out.println("1");
        // calling main method with string parameter
        MethodOverloading12.main("yash");
	}
	public static void main(String args)
	{
		System.out.println("2");
	}
}
/*
 * Output -
 * 1
 * 2
 */
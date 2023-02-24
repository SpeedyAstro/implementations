class TryCatch4
{
	public static void main(String[] args)
	{
		System.out.println("1");
		try
		{
			System.out.println(100/0);
			System.out.println("2");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("3");
		}
		System.out.println("4");
	}
}
/*
 * Output 
 * 1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at TryCatch4.main(TryCatch4.java:8)
 */
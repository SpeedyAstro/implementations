class TryCatch5
{
	public static void main(String[] args)
	{
		System.out.println("1");
		try
		{
			System.out.println(100/0);
			System.out.println("2");
		}
		catch(ArithmeticException e)
		{
			System.out.println("3 catch");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("3....");
		}
		System.out.println("4");
	}
}
/*
 * output
 * 1
3 catch
4
 */
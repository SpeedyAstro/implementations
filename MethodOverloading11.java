class MethodOverloading11
{
	public static void main(String[] args)
	{
		System.out.println("1");

		int[] arr={10,20};
        MethodOverloading11.main(arr);
	}
	public static void main(int[] args)
	{
		System.out.println("2");
	}
}
/*
 * Output -
 * 1
 * 2
 */
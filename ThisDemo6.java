class ThisDemo6
{
	ThisDemo6()
	{
		this(10);
		System.out.println("1");
		//this(10);	this is compile time error -> "Constructor call must be the first statement in a constructor"
	}
	ThisDemo6(int no)
	{
		System.out.println(no);
	}
	public static void main(String[] args)
	{
		ThisDemo6 ob2=new ThisDemo6();
	}
}

class Vehicle
{
	void start()
	{
		System.out.println("1");
	}
}
class AnonymousInnerClass
{
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle()
		{
			public void start()
			{
				System.out.println("starts with key");
			}
		};
		v.start();
		Outer outer = new Outer();
		outer.outerMethod();
		
	}
}
class Outer {
	void outerMethod(){
		class Inner{
			void innerMethod(){
				System.out.println("Inner");
			}
		}
	}
	// System.out.println("outer");
}
class Outer1{
	static class Inner1{
		void innerMethod(){
			System.out.println("Inner");
		}
	}
	void outer(){
		System.out.println("Outer");
	}
}
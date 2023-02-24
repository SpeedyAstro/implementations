// class A
// {
// 	int show()
// 	{
// 		System.out.println("1");
// 		return 0;
// 	}
// }
// class B extends A
// {
// 	void show()
// 	{
// 		System.out.println("2");
// 	}
// }
// class MethodOverriding5
// {
// 	public static void main(String[] args)
// 	{
// 		A ob3=new B();
// 		ob3.show();
// 	}
// }
// /*
//  * error
//  * iding5 }
// MethodOverriding5.java:11: error: show() in B cannot override show() in A
//         void show()
//              ^
//   return type void is not compatible with int
// 1 error
//  */
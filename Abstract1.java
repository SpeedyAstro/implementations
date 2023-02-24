public class Abstract1 {
    public static void main(String[] args) {
        test t = new test(){
            @Override
            public void greet(){
                System.out.println("hello");
            }
        };
        t.greet();
    }
}

abstract class test{
    abstract void greet();
}

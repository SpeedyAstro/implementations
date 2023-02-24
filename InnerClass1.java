public class InnerClass1 {
    public static void main(String[] args) {
        test t = new test(){
            @Override
            void greet() {
                System.out.println("good evening!");
            }
        };
        t.greet();
    }
}
class test{
    void greet(){
        System.out.println("Good Morning!");
    }
    void sayHello(){
        System.out.println("hey");
    }
}
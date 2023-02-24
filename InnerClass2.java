public class InnerClass2 {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.Inner  ic = oc.new Inner();
        OuterClass.Inner ic1 = new OuterClass().new Inner();
    }
}
class OuterClass{
    int x;
    class Inner{
        void greet(){
            int b,c,a = 1;
            b=c=a;
            System.out.println("hello, have a great day today!");
        }
    }
}
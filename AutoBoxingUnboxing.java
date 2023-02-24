
public class AutoBoxingUnboxing {
    // public static void methodOne(Integer i){
    //     System.out.println("autoboxing");
    // }
    public static void methodOne(Object o){
        System.out.println("Object");
    }
    // public static void methodOne(long l){
    //     System.out.println("Widening");
    // }
    public static void main(String[] args) {
        int x =10;
        methodOne(10);
    }
}


// class parent1{
//     int age = 12;
//     void showAge(){
//         System.out.println(age);
//     }
// }
// class parent2{
//     int age = 11;
//     void showAge(){
//         System.out.println(age);
//     }
// }
// class child extends parent1, parent2 {
//     int age = 1;
//     @Override
//     void showAge(){
//         System.out.println(age);
//     }

// }
// public class inhertanceTest {
//     public static void main(String[] args) {
//         child s = new child();
//         s.showAge();
//     }
// }
 /// test failed
abstract class Counter{
    int value;
    private Counter(){
        this.value = 0;
        System.out.println("Counter No-Arguments constructor");
    }
    public Counter(int value) {
        this.value = value;
        System.out.println("Parametrized Counter constructor");
    }
}
class SimpleCounter extends Counter{
    public SimpleCounter(int value){
        super(value);
    }
}
class inhertanceTest{
    public static void main(String[] args) {
        SimpleCounter sc = new SimpleCounter(11);
        System.out.println(sc.value);
    }
}
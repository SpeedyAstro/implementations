import java.util.*;
abstract class AbstractClass{
    public AbstractClass(){
        System.out.println("Abstract class constructor");
    }
}
class ConcreteClass extends AbstractClass{
}
class ConcreteClassB extends AbstractClass{
    public ConcreteClassB(){
        System.out.println("Concrete Class Constructor");
    }
    // public AbstractClass(){ 
        // can not override constructor , compiler need return type if doing so otherwise throw compile type error
    // }
}
public class AbstractConstructor {
   public static void main(String[] args) {
    ConcreteClass c = new ConcreteClass();
    ConcreteClassB cc = new ConcreteClassB();
   } 
}

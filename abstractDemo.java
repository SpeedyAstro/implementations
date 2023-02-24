abstract class Vehicle{
    int a =1 ;
    abstract void start();
}
class Scooter extends Vehicle{
    @Override
    void start() {
        System.out.println("Start with a kick");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Start with a key");
    }
}
public class abstractDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Scooter sc = new Scooter();
        sc.start();
    }
}
/*
 * Difference between Concrete method and abstract method
 * -> concrete method can have declaration as well as implementation but abstrac method can only be declared
 * -> abstrat method need to be declared with abstract keyword
 * -> abstract method provide more shareability
 * -> concrete method can be defined in a class as well as abstract class 
 * -> abstract method can only be defined in abstract class 
 * 
 * 
 * Difference between Concrete class and Abstract class
 * -> concrete class can have methods only concrete 
 * -> Abstract class can define concrete method as well as abstract method 
 * -> instance can be create of concrete class  but it is not the case with abstract class 
 * -> to declate abstract class it must be initailized with abstract keyword
 */

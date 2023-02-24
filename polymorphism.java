import javafx.beans.property.SimpleDoubleProperty;

class test{
    void Display(String a, int b){
        System.out.println("String : "+ a+ "Integer : " +b);
    }
    void Display(int a , String b){ // method overloading [acheived by differnet sequence]
        System.out.println("Int" +a+ "String" +b);
    }
    void sum(int a , int b){
        System.out.println(a+b);
    }
    void sum(float a  ,float b){ // method overloading [differnet type of datatype]
        System.out.println(a +b );
    }
    void print(int a){
        System.out.println(a);
    }
    void print(int a, int b){ // method overloading [different no of parameters]
        System.out.println(a +"two parameters"+ b);
    }
}
public class polymorphism {
    /*
     * polymorphism : it made up with do words - poly -> many , morphism -> forms 
     * Need ? -> provides flexibility in program , 
     * basically to achieve polymorphism , we create a functionality that have many forms 
     * polymorphism can be achieved by two ways : 
     *  1) compile time polymorphism -> it is occured in compile time 
     *      -> method overloading -> it is acheived by "compiler" trying to resolve method call on compile time , in this senario we define methods with the same name in a single class , but accepts different type of arguments 
     *  Arguments can be different means -> No of parametere , types of parameter(accepts different data types [no of paramentr can be same here] , sequence of parameters (can be same no of parameters , but different in the sequence in which method accepts))  
     *     -> operator overloading -> java do not supports operator overloading , but still in the development time it used + operator overloading , but in the practical use cases method overloading is not supported even not + operator                               
     *  2) Runtime polymorphism -> 
     *      -> method overriding - the process in JVM try to resolve the method call based on reference type is known as method overriding
     */
    public static void main(String[] args) {
        test t = new test();
        t.Display("yash", 1);
        t.Display(1, "yash");
        t.sum(2.2f, 33.3f);
        t.sum(2, 33);
        t.print(1);
        t.print(1, 2);
    }
}

class parent{
    private int age;
    private String name;
    parent(int age ,String name){
        this.age = age;
        this.name = name;
        System.out.println("your age  :" + age + "your name :" + name); 
    }
    void getDetail(){
        
        System.out.println("your age  :" + age + "your name :" + name);
    }
    
}
class child extends parent{
    child(int a){
        super(a , "yash");
        //System.out.println(a);

    }
}
public class thiskey {
    public static void main(String[] args) {
        parent p = new parent(12, "yash");
        p.getDetail();
        child c = new child(1982);
    }
}

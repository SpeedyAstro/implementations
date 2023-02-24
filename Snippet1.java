public class Snippet1{
    public static void main(String args[]){
        byte x=10;
        switch(x+1)
        {
            case 10:System.out.println("hello");
            break;
            case 100: System.out.println("hiee");
            break;
            case 1000: System.out.println("byee");//
            break;
        }
    }
}
    // A. CompileTimeError
    // B. hello
    // C. JVM will create problem at the runtime
    // D. hiee
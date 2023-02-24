import java.util.function.Predicate;

public class predicateClass {
    public static void main(String[] args) {
        int arr [] = {0,1,2,3,4,5,7,12,18,43,10,15,20,25};
        Predicate<Integer> p1 = i-> i>10;
        System.out.println("Element greater than 10");
        m1(p1, arr);
        Predicate<Integer> p2 = i-> i%2==0;
        System.out.println("Even Elements :"); 
        m1(p2, arr);
        System.out.println("Elements greater than 10 and even");
        m1(p1.and(p2), arr);
        System.out.println("Elements not even / Odd numbers :");
        m1(p2.negate(), arr);
    }
    static void m1(Predicate<Integer> p , int [] arr){
        for (int i : arr) if(p.test(i)) System.out.println(i);
    }
}
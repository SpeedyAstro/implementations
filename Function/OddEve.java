import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.

public class OddEve {
    private static void evenOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOdd(n);
    }
}

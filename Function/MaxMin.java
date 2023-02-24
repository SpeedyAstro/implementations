// package Function;

import java.util.Scanner;

public class MaxMin {

    private static void Maxnum(int a,int b ,int c){
        int max = a;
        if(max<b){
            max = b;
        }
        if(max<c){
            max = c;
        }
        System.out.println("Maximum : "+max);
    }
    private static void Minnum(int a, int b , int c){
        int min = a;
        if(min>b){
            min = b;
        }
        if(min>c){
            min = c;
        }
        System.out.println("Minmum : "+min);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Maxnum(a, b, c);
        Minnum(a, b, c);
    }
}

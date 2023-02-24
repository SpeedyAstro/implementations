import java.util.Arrays;
import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][];
        arr = new int[3][2];
        //taking input for array
        // for(int i = 0 ; i < arr.length; i++){
        //     for(int j = 0 ; j < arr[i].length;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println(Arrays.toString(arr)); // print the reference address 
        for(int[] ele : arr){
            System.out.println(Arrays.toString(ele));
        }
        int arr1[][]= {
            {12,32,51},
            {42,21},
            {43,73,27,53}
        };
        for(int[]ele : arr1){
            System.out.println(Arrays.toString(arr1));
        }
        for(int i = 0 ; i < arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        sc.close();
    }
}

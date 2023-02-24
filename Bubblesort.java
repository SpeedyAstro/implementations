import java.util.Arrays;


public class bubblesort{
    static void sort(int []arr){
    
        int n = arr.length;
        for(int i = 0;i<n ; i++){
            for(int j = 1    ; j < n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
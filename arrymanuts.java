import java.net.SocketTimeoutException;
import java.util.Arrays;

public class arrymanuts {
    public static void main(String[] args) {
        int r = 1 ,c = 4;
        int [][] matrix = new int[30][2];
        int i = 0;
        matrix[i++] = new int[]{r,c};
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        for(int j = 0 ; j < 30 ; j++){
            for(int i1  =0 ; i1 < 2 ; i1++){
                System.out.println(matrix[j][i1]);
            }
        }
        int d = 0;

        d = d++%2;
        System.out.println(d);
        d = d % 2;
        System.out.println(d);
        d = ++d%2;
        System.out.println(d);
        // System.out.println(Arrays.toString(matrix));
    }
}

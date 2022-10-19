import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class DeepToStringDemo {
    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(Arrays.toString(arr[0]));
        // for (int i = 0; i < arr[0].length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.out.print(arr[i][j] +" ");
        // }
        // System.out.println();
        // }
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class  Permutations {

    public static void perm(int[] list, int n) {
        int k;
        if (n == 1) {
            if((list[0]!=1 & list[1] !=2) & (list[0]!=2 & list[1] !=1) & (list[1]!=1 & list[2] !=2) & (list[1]!=2 & list[2] !=1)
            &(list[2]!=1 & list[3] !=2)  & (list[2]!=2 & list[3] !=1) ) {
                    System.out.println(Arrays.toString(list));
                }
        }
        else {
            for (int i = 0; i < n; i++) {
                perm(list, n - 1);

                int j = (n % 2 == 0) ? i : 0;

                int t = list[n - 1];
                list[n - 1] = list[j];
                list[j] = t;
            }
        }
    }


    public static void main(String[] args) {

        int[] list = new int[]{1, 2, 3, 4};
        perm(list, list.length);

    }
}
import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int start = 0; start < arr.length; start++) {
            for (int some = start + 1; some < arr.length; some++) {
                if (arr[start] == arr[some]) {
                    arr[some] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}

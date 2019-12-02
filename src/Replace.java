import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < array.length; i++) {
            for (int b = i + 1; b < array.length; b++) {
                if (array[i] == array[b]) {
                    array[b] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

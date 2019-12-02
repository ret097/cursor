import java.util.Arrays;
import java.util.Collections;

public class Revers {
    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 7, 11};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

}

public class Sum {
    public static void main(String[] args) {
        int[] array = {-4, 5, -7, -22, 18};
        int sum = 0;

        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

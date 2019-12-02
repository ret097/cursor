public class Average {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 22, 18};
        float sum = 0f;
        float average;

        for (int i : array) {
            sum += i;
        }
        average = sum / array.length;
        System.out.println(average);
    }
}

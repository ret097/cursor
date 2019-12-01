public class Average {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 22, 18};
        float summa = 0f;
        float average;

        for (int i : array) {
            summa += i;
        }
        average = summa / array.length;
        System.out.println(average);
    }
}

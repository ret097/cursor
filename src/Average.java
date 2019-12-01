public class Average {
    public static void main(String[] args) {
        int[] rarre = {4, 5, 7, 22, 18};
        float summa = 0f;
        float average;

        for (int i : rarre) {
            summa += i;
        }
        average = summa / rarre.length;
        System.out.println(average);
    }
}

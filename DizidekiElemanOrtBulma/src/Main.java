public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        double harmonik = 0.0;
        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        System.out.println("Ortalama: " + sum / numbers.length);
        for (double j = 1; j <= numbers.length; j++)
        {
            harmonik += (1 / j);
        }
        System.out.println("Harmonik Ortalama: " + harmonik);

    }
}

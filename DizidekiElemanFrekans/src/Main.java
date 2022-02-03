import java.util.Arrays;

//Dizideki Elemanların Frekansı
/*

Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */
public class Main
{
    static boolean isFrequence(int[] arr, int n) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++)
        {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count >= 1) {
                System.out.println(arr[i] + " sayısı " + count+" kere tekrar edildi. ");
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int n = list.length;
        System.out.println("----------------------------------------");
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("----------------------------------------");

        System.out.println("Tekrar Sayıları :");
        isFrequence(list, n);

    }

}

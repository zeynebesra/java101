//Dizideki Tekrar Eden Sayıları Bulan Program

public class Main
{
    //dizide tekrarlanan elemanın var olup olmadığını kontrol eden motot
    static boolean isFind(int[] arr, int value)
    {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    //tekrarlanan elemanın çift olup olmadığını kontrol eden metot
    static boolean isEven(int[] arr, int value)
    {
        for (int j : arr) {
            if (j % 2 == 0 && value % 2 == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] list = {22, 7, 3, 22, 2, 4, 10, 4, 7, 1, 33, 2, 9, 1, 10};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list.length; j++)
            {
                if ((i != j) && (list[i] == list[j]))
                {
                    if (isEven(duplicate, list[i])) { //eğer dizinin tekrarlanan elemanı çift ise
                        if (!isFind(duplicate, list[i])) { //tekrarlanan eleman daha önce diziye eklenmiş mi?
                            duplicate[startIndex++] = list[i]; //tekrarlanan elemanı diziye ekle
                        }
                    }
                    break;
                }
            }
        }
        for (int value : duplicate)
        {
            if (value != 0) { //dizinin geri kalan elemanları 0 ise sadece tekrarlayan değerleri yaz
                System.out.print(" " + value + " ");
            }
        }

    }
}

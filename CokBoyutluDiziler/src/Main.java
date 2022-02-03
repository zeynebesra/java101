// Çok Boyutlu Diziler ile Harfi Yazdıran Program

public class Main
{
    public static void main(String[] args)
    {
        /*
        // A
        String[][] letter = new String[6][4];
        System.out.println("-------------------");
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }

            System.out.println();
        }
        System.out.println("-------------------");

         */

        // B
        System.out.println("-------------------");
        String[][] letter2 = new String[7][4];
        for (int i = 0; i < letter2.length; i++)
        {
            for (int j = 0; j < letter2[i].length; j++)
            {
                if (i == 0 || i == 3 || i == 6)
                {
                    letter2[i][j] = " * ";
                    letter2[0][3] = "   ";
                    letter2[6][3] = "   ";
                }
                else if (j == 0 || j == 3)
                {
                    letter2[i][j] = " * ";
                }
                else
                {
                    letter2[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter2)
        {
            for (String col : row)
            {
                System.out.print(col);
            }

            System.out.println();
        }
        System.out.println("-------------------");
    }
}

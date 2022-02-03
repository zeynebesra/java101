// Matris Transpozunu Bulma
public class Main {
    /*
    public static void main(String[] args) {

        int[][] matris = {{2, 3, 4}, {5, 6, 4}};
        System.out.println("--------------");
        System.out.println("Matris : ");
        //MATRİS
        for (int i = 0; i < matris.length; i++)
        {
            for (int j = 0; j <= matris.length; j++)
            {
                System.out.print(matris[i][j]);
            }
            System.out.println();

        }
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("Transpoze: ");
        //TRANSPOZE
        for (int i = 0; i <= matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i]);
            }
            System.out.println();
        }
        System.out.println("--------------");

    }

     */

    static void transpoz(int[][] arr)
    {

        int[][] trpz = new int[arr[0].length][arr.length];

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++) {
                trpz[y][x] = arr[x][y];
            }
        }

        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("Transpoz : ");

        for (int[] ints : trpz) {
            for (int j = 0; j < trpz[0].length; j++) {
                System.out.print(ints[j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] list = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("--------------");
        System.out.println("Matris : ");
        for (int[] ints : list) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(ints[j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        transpoz(list);
        System.out.println("--------------");

    }
}

import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineNumber;
    String[][] answerBoard;
    String[][] board;
    int correctAnswer = 0;
    int row;
    int column;
    int rowMaxLimit;
    int rowMinLimit;
    int columnMaxLimit;
    int columnMinLimit;
    int mineCount=0;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineNumber = rowNumber * colNumber / 4;
        this.board = new String[rowNumber][colNumber];
        this.answerBoard = new String[rowNumber][colNumber];
    }

    void fillArr() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.answerBoard[i][j] = "-";
                this.board[i][j] = "-";
            }
        }

    }

    void placeMines() {
        for (int i = 0; i < this.mineNumber; i++) {
            int row = (int) (Math.random() * this.rowNumber);
            int column = (int) (Math.random() * this.colNumber);
            if (this.answerBoard[row][column].equals("*")) {
                i--;
            }
            this.answerBoard[row][column] = "*";
        }
    }

    void showBoard() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void showAnswerBoard() {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.answerBoard[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void findMines() {
        this.rowMaxLimit = this.row + 1;
        this.rowMinLimit = this.row - 1;
        this.columnMinLimit = this.column - 1;
        this.columnMaxLimit = this.column + 1;

        if (this.rowMinLimit < 0) {
            this.rowMinLimit++;
        }
        if (this.rowMaxLimit > this.answerBoard[0].length - 1) {
            this.rowMaxLimit--;
        }
        if (this.columnMinLimit < 0) {
            this.columnMinLimit++;
        }
        if (this.columnMaxLimit > this.answerBoard.length - 1) {
            this.columnMaxLimit--;
        }
        for (int i = this.rowMinLimit; i <= this.rowMaxLimit; i++) {
            for (int j = this.columnMinLimit; j <= this.columnMaxLimit; j++) {
                if (this.answerBoard[i][j].equals("*")) {
                    this.mineCount++;
                }
            }
        }
        this.board[this.row][this.column] = Integer.toString(this.mineCount);
        this.mineCount = 0;
    }

    void run() {
        Scanner input = new Scanner(System.in);
        this.fillArr();
        this.placeMines();
        this.showAnswerBoard();

        while (this.correctAnswer < this.rowNumber * this.colNumber - this.mineNumber) {
            System.out.println("=========================");
            this.showBoard();
            System.out.print("Satır sayısı gir: ");
            this.row = input.nextInt()-1;
            System.out.print("Sütun sayısı gir: ");
            this.column = input.nextInt()-1;
            if (this.row >= 0 && this.row < this.board[0].length) {
                if (this.column >= 0 && this.column < this.board.length) {
                    this.findMines();
                    correctAnswer++;
                    if (this.correctAnswer == this.rowNumber * this.colNumber - this.mineNumber) {
                        System.out.println("Son tablo");
                        this.showBoard();
                        System.out.println("====================");
                        System.out.println("Tebrikler. Kazandınız.");

                    }

                    if (this.answerBoard[this.row][this.column].equals("*")) {
                        this.showAnswerBoard();
                        System.out.println("Patladınız.");
                        System.out.println("Oyunu Kaybettiniz.");
                        return;
                    }
                } else {
                    System.out.println("==Geçerli aralık giriniz.==");
                }
            } else {
                System.out.println("==Geçerli aralık giriniz.==");
            }
        }
    }
}

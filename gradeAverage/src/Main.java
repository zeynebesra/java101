import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gradeMath = 0, gradePhysics= 0, gradeChemistry = 0;
        int gradeTurkish= 0, gradeHistory= 0, gradeMusic = 0;

        System.out.print("Grade of Math Course : ");
        gradeMath = input.nextInt();
        gradeMath = (gradeMath > 100) ? 100 : gradeMath;

        System.out.print("Grade of Physics Course : ");
        gradePhysics = input.nextInt();
        gradePhysics = (gradePhysics > 100) ? 100 : gradePhysics;

        System.out.print("Grade of Chemistry Course : ");
        gradeChemistry = input.nextInt();
        gradeChemistry = (gradeChemistry > 100) ? 100 : gradeChemistry;

        System.out.print("Grade of Turkish Course : ");
        gradeTurkish = input.nextInt();
        gradeTurkish = (gradeTurkish > 100) ? 100 : gradeTurkish;

        System.out.print("Grade of History Course : ");
        gradeHistory = input.nextInt();
        gradeHistory = (gradeHistory > 100) ? 100 : gradeHistory;

        System.out.print("Grade of Music Course : ");
        gradeMusic = input.nextInt();
        gradeMusic = (gradeMusic > 100) ? 100 : gradeMusic;

        input.close();

        int avg = (gradeMath + gradePhysics + gradeChemistry + gradeTurkish + gradeHistory + gradeMusic)/6;
        System.out.println("\nAverage: " + avg);

        String resp = (avg > 60) ? "Passed." : "Failed.";
        System.out.println(resp);
    }
}

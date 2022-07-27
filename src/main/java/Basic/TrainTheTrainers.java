package Basic;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juri = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int presentationCount = 0;
        double allPresentationGrade = 0;
        while(!input.equalsIgnoreCase("Finish")) {
            String presentation = input;
            presentationCount++;
            int count = juri;
            double totalSumGrades = 0;
            while(count > 0){
                double grade = Double.parseDouble(sc.nextLine());
                totalSumGrades+=grade;
                count--;
            }
            double averageGrade = totalSumGrades / juri;
            allPresentationGrade += averageGrade;
            System.out.printf("%s - %.2f.\n", presentation, averageGrade);

            input = sc.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.\n", allPresentationGrade /presentationCount);
    }
}

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
            System.out.printf("%s - %.2f\n", presentation, averageGrade);

            input = sc.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.\n", allPresentationGrade /presentationCount);
    }
}
//    От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
//
//        След това на отделен ред се прочита името на презентацията - текст
//
//        За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
//
//        След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
//
//        "{името на презентацията} - {средна оценка}."
//
//        След получаване на команда "Finish" на конзолата се печата
//        "Student's final assessment is {среден успех от всички презентации}." и програмата приключва.
//
//        Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.
import java.util.Scanner;

public class Student_grade_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberSubjects = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numberSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double avgPercentage = (double) totalMarks / numberSubjects;
        String grade = calculateMarks(avgPercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }

    public static String calculateMarks(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C+";
        } else if (percentage >= 40) {
            return "C";
        }
        else if(percentage >= 30) {
            return "D";
        }else {
            return "F";
        }
    }
}


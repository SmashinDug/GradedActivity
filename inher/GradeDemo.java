package inher;

import java.util.Scanner;

/* this program demonstrates the GradedActivity Class */


public class GradeDemo {
    
    private static GradedActivity GradedActivity;

    public static void main(String[] args) {
        
        double testScore; //to hold the test score

        Scanner keyboard = new Scanner(System.in);

        GradedActivity = new GradedActivity();

        System.out.println("Enter a numeric Score");
        testScore = keyboard.nextDouble();

        GradedActivity.setScore(testScore);

        System.out.println("The grade for that test is " + GradedActivity.getGrade() );


        keyboard.close();
    }
}

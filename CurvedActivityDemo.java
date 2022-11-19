package inher;

import java.util.Scanner;


public class CurvedActivityDemo {
    
    public static void main(String[] args) {
        
        double score, curvePercentage;

        Scanner keyboard = new Scanner(System.in);
        // get the adjusted exam score.
        System.out.println("Enter the students raw numeric score " );
         score = keyboard.nextDouble();

        // get curved percentage 
         System.out.println("Enter the Curve percentage" );
         curvePercentage = keyboard.nextDouble(); 


         //create curved activity object
         CurvedActivity curvedExam = new CurvedActivity(curvePercentage);

         // set the exam score
         curvedExam.setScore(score);

        // Display the test results
        System.out.println("The raw score is " + curvedExam.getRawScore() + "points ");

        System.out.println(" The cruved score is  "+ curvedExam.getScore());
        
        System.out.println("The exam grade is " + curvedExam.getGrade());


        keyboard.close();
    }
}
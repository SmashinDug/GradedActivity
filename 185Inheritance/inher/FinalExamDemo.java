package inher;
import java.util.Scanner;

/*
 * this program demonstrates the FinalExam class which inherits from the GradedActivity Class
 */

public class FinalExamDemo {
    
    public static void main(String[] args) {
        int questions, missed;
        
        Scanner keyboard = new Scanner(System.in);

        // get the number of questions on the final exam

        
        System.out.print("How many questions are on" + "the final exam? ");
        questions = keyboard.nextInt();
     
        System.out.print("How many questions did the " + "student miss? ");
        missed = keyboard.nextInt();


        FinalExam exam = new FinalExam(questions, missed);

        System.out.println("Each question counts " + exam.getPointsEach() + "points ");

        System.out.println("The exam score is " + exam.getScore());

        System.out.println("The exam grade is  " + exam.getGrade());

        keyboard.close();
        

        
    }
    

}

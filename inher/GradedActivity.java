package inher;
public class GradedActivity {

    private double score;
    
    /*
     *  the setscore method stores tis argument in the score field.
     */

public void setScore(double s)
{
    score = s;
}

public double getScore() {
    return score;
}

public char getGrade() {
    char letterGrade; // to hold the grade

    if (score >= 90)
        letterGrade = 'A';

    else if (score >= 80)
        letterGrade = 'B';

    else if (score >=70)    
        letterGrade = 'C';
   
    else if (score >=60)    
        letterGrade = 'D';

    else
        letterGrade = 'F';

    return letterGrade;    
    

}















}

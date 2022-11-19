package inher;
public class FinalExam extends GradedActivity {

    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public FinalExam(int questions, int missed) {
        double numbericScore;

        // set the numQuestions and numMissed fields.
        numQuestions = questions;
        numMissed = missed;

        //calculate the points for each question and the numberic score for this exam
        pointsEach = 100.0 / questions;
        numbericScore = 100.0 - (pointsEach * missed);


        setScore(numbericScore);

    }
    

    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() 
    {
        return numMissed;
    }

}

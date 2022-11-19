package inher;

public class CurvedActivity extends GradedActivity {
    
    double  rawScore;
    double  percentage;

    public CurvedActivity(double percent) {

        percentage = percent;
        rawScore = 0.0;
    }




/*
 * the setScore method overrides the superclass method. this version accepts the adjusted score as an argument. that score
 * is manipulated by the curve percentage and the result is sent as an arguemtn to the superclass's setScore method
 */

@Override
public void setScore(double s) {
    rawScore = s;
    super.setScore(rawScore * percentage);
}


public double getRawScore() {
    return rawScore;
}
/*
 * the getPercentage method returns the curve
 * 
 */

 public double getPercentage() {
    return percentage;
 }







}



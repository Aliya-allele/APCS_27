public class StepTracker{
   private int minsteps;
   private int day;
   private double step;
   private int totaldays;
   private int totalsteps;
   public StepTracker(int minimum){
    minsteps=minimum;
    day=0;
    step=0.0;
   }
    public void addDailySteps(int mini){
        totalsteps+=mini;
        if(minsteps>=10000){
         day++;
         totaldays++;
        }else{
        day=day;
        totaldays++;
        }

    }
    public int activeDays(){
        return day;
    }
    public double averageSteps(){
        double avg=0;
       avg=(double)totalsteps/totaldays;
       return avg;
    }
    
}
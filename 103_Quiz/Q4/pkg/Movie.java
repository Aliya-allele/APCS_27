package pkg;

public class Movie{
   private String movieName;
  private  double rating;
    private int numRatings;
    private int revenue;

    public Movie(){
        movieName="Avengers";
        rating=8.0;
        numRatings=33;
        revenue=623357910;
    }
    public Movie(String name,double feelings,int amount,int money){
        movieName=name;
        rating=feelings;
        numRatings=amount;
        revenue=money;
    }

    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double newRating){
        double a=numRatings+1.0;
        double b=(numRatings*rating)+newRating;
        double finalRating=b/a;
        rating=finalRating;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie x){
        if(rating>x.getRating()){
            return true;
        }else{
            return false;
        }
    }
    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating: "+rating);
        System.out.println("Number of Ratings: "+numRatings);
        System.out.println("Revenue: "+revenue);
        System.out.println();
    }
    public String revenueToString(){
        int ans=0;
        int rev=revenue;
        while(rev>=1000){
            int three=rev%1000;
            int ans=","+three+ans;
            rev=rev%1000;
        }
        ans=rev+ans;
        return ans;
        }
    public Movie pirateMovie(){
        Movie temp=new Movie(movieName,rating,numRatings,revenue);
        return temp;
    }
}
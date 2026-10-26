/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
        int random=(int)(Math.random()*3+1);
        if(random==1){
            return "rock";
        }else if(random==2){
            return "paper";
        }else{
            return "scissors";
        }
    }
    public static int compare2(String uno,String zwei){
        if(uno.equals(zwei)){
            return 0;
        }else if((uno.equals("rock")&&zwei.equals("scissors"))||(uno.equals("paper")&&zwei.equals("rock"))||(uno.equals("scissors")&&zwei.equals("paper"))){
            return 1;
        }else{
            return 2;
        }
    }
    public static void main(String[] args) {
        Scanner me=new Scanner(System.in);
        String answer="";
        while(!answer.equals("done")){
        System.out.println("Would you like to play the computer? (yes/no/done)");
        answer=me.nextLine();
        if(answer.equals("yes")){
            System.out.println();
            System.out.println();
            String answer1="";
            String answer2=getObject();
            while((!answer1.equals("rock"))&&(!answer1.equals("scissors"))&&(!answer1.equals("paper"))){
            System.out.println("Please enter rock/paper/scissors:");
            answer1=me.nextLine();
            }
            if(compare2(answer1,answer2)==0){
                System.out.println("You tied.");
                System.out.println();
            }else if(compare2(answer1,answer2)==1){
                System.out.println("You won.");
                 System.out.println();
            }else{
                System.out.println("You lost.");
                 System.out.println();
            }
        }else if(answer.equals("no")){
            System.out.println();
            System.out.println("How many times would you like the computer to play against itself?");
            int number=me.nextInt();
            me.nextLine();
            int a=0;
            int b=0;
            int c=0;
            int d=0;
            int ans=0;
            while((a<number)){
            ans=compare2(getObject(),getObject());
            if(ans==0){
                b++;
            }else if(ans==1){
                c++;
            }else{
                d++;
            }
            a++;
            }
            System.out.println("Player 1 wins: "+c);
            System.out.println("Player 2 wins: "+d);
            System.out.println("Ties: "+b);
         }
        }

    }
}

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes"))
        {
            Random rand=new Random();
            int randnum=rand.nextInt(100);
           // System.out.println("Please enter the no between 1 to 100");
            int guessno=-1;   //sc.nextInt();
            int trygame=0;

            while(guessno!=randnum)
            {
                System.out.println("please guess a no between 1 to 100");
                guessno=sc.nextInt();
                trygame++;

                if(guessno==randnum)
                {
                    System.out.println("Congratulation guessno and randnum are same");
                    System.out.println("ur guessno is equal to randno in"+ trygame+ " in th times");
                    System.out.println("Would you like to play again Yes or No");
                    play=sc.next().toLowerCase();
                }
                else if(guessno > randnum)
                {
                    System.out.println("You guess too high no");
                }
                else
                {
                   System.out.println("You guess too low no");
                }
            }
        }
        sc.close();
    }
}
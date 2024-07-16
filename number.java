import java.util.Scanner;
import java.util.Random;
class number
{
    int ran;
    int num;
    number(int r)
    {
       ran = r;
    }
//returns true if it is correct else returns guess number
    public int guess()
    {
        int g1  ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number from 0 to 100");
        g1 = sc.nextInt();
        if (g1 == ran) {
            return 1 ;
        }
        else
        {
            return g1;
        }
    }
//comapers the number and gives the o\p
    public void compare(int g1)
    {
        if (g1 > ran) {
            System.out.println("too high");
            
        }
        else
        {
            System.out.println("too low");
        }
    }
    //calls the functions, gets the random number and prints the score
    public static void main (String args [])
    { 
        int c = 1;
        int score = 0 ;
        System.out.println("Welcome to the number game , you have 3 attempts to guess the number between 0 to 100");
        while (c!=0) {

            Scanner sc = new Scanner (System.in);
        Random rand = new Random();

        int random = rand.nextInt(100);
        System.out.println(random);
        number obj = new number(random);


    
        int g = 0;
         g = obj.guess();
        for(int i = 1 ; i<3;i++){
        if (g == 1) {
            System.out.println("Correct");
            score += 1;
            break;
        }
        else{
            obj.compare(g);
             g = obj.guess();
        }
       
    }
    System.out.println("If you want play another round press 1 else press 0 ");
    c = 0;
    c = sc.nextInt();
        }
        System.out.println("Your score is "+score);
        System.out.println("Thank you :)");

    }
}
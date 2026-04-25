import java.util.Scanner;
import java.util.Random;

public class Randomnumberguessgame {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();




        int guess;
        int min = 1;
        int max = 100;
        int randomnumber = random.nextInt(min, max + 1);
        int attempts = 0;

        System.out.println("Welcome to the game");
         System.out.printf("Enter the number between %d - %d\n", min, max);
    

        do{

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomnumber){

                System.out.println("Too low! Try again");
                
            } else if (guess > randomnumber){
                System.out.println("Too High! Try again");
            }else{
                System.out.println("Correct! The number was " + randomnumber);
                System.out.println("# of attempts: " + attempts);
            }
            
        
        } while (guess != randomnumber);

        scanner.close();
        



    }
    
}

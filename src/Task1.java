import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
public static void main(String[] args){
    boolean Value = true;
    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("Welcome to the Number Game!");
    System.out.println("I picked a random number for you and you'll have to guess it.");
    Random random = new Random();
    int randomNumber = random.nextInt(100 - 1 + 1) + 1;
    while(Value) {
    System.out.println("Enter your guess(Between 1-100)");
       int Guess = sc.nextInt();
        if (Guess == randomNumber) {
            System.out.println("Your Guess was Correct!");
            System.out.println("Play Again?(Y/N)");
            String a = sc.next();
            if (Objects.equals(a, "Y") || Objects.equals(a, "y"))Value = true;
            else{System.out.println("Thanks for playing"); Value = false;}
        } else if (Guess > randomNumber) {
            System.out.println("Your Guess was too high,please try again.");

        } else if (Guess < randomNumber) {
            System.out.println("Your Guess was too low,please try again");

        } count ++;
        if (count >= 20){
            System.out.println("Max Guess! Cant guess anymore");
            return;
        }
    }

}
}
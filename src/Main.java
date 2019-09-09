import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner key = new Scanner(System.in);
        int secretNumber, guess = 0;

        secretNumber = 5;

        System.out.println("Guess which day Barack Obama's birthday fell on in 2017");
        System.out.println("(1)= Sunday");
        System.out.println("(2)= Monday");
        System.out.println("(3)= Tuesday");
        System.out.println("(4)= Wednesday");
        System.out.println("(5)= Thursday");
        System.out.println("(6)= Friday");
        System.out.println("(7)= Saturday");
        guess = key.nextInt();

        while ( guess != secretNumber)
        {
            System.out.println("\nYou are wrong! Try again.");
            System.out.println("Enter another day1");
            guess = key.nextInt();
        }
        System.out.println("You are correct. You win a prize!");
        key.close();

    }
}

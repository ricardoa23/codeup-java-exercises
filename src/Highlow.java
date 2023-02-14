import java.util.Scanner;

public class Highlow {

    public static boolean higher(int userGuess, double number) {
        if (userGuess > number) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lower(int userGuess, double number) {
        if (userGuess < number) {
            return true;
        } else {
            return false;
        }
    }

    public static void guess(double number) {
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();
        if(lower(userGuess, number)) {
            System.out.println("\nHigher");
            guess(number);
        } else if(higher(userGuess, number)) {
            System.out.println("\nLower");
            guess(number);
        } else {
            System.out.println("Good guess you must be a wizard");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Math.ceil((Math.random() * 100) - 1);
        System.out.printf("%.0f\n", number);
        System.out.println("I'm thinking of a number can guess it");

        guess(number);


    }
}


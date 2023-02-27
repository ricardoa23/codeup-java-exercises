import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int weirdMultiplication(int x, int y) {
      int  answer = 0;
        for (int i = 0; i < y; i++) {
           answer += x;
        }
        return answer;
    }


    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input < min | input > max)  {
            if (input >= min && input <= max) {
                break;
            }
                System.out.println("Please enter a number between 1 and 10: ");
                input = sc.nextInt();
        }
        return input;
    }



    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter a number between 1 and 10: ");
        int input = sc.nextInt();
        String answer = "";
        long quotient = 1;

        if(input >= 1 && input <= 10) {
            for (int i = 1; i <= input; i++) {
                quotient *= i;
                if (i == input) {
                    answer += i;
                } else {
                    answer += i + " x ";
                }
            }
        System.out.printf("%d! = %s = %d", input, answer, quotient);

        } else {
            System.out.println("\nInvalid number");
            factorial();
        }
        System.out.println("\nWould you like to try again?[y/n]");
        String tryAgain = sc.next();
        if(tryAgain.equalsIgnoreCase("y")) {
            factorial();
        }
    }
        public static void rollDice() {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many side do the dice have?");
            int sides = sc.nextInt();
            System.out.println("would you like to roll?[y/n]");
            String rollPrompt = sc.next();
            if (rollPrompt.equalsIgnoreCase("y") || rollPrompt.equalsIgnoreCase("yes")) {
                double roll = Math.ceil(Math.random() * sides);
                double roll2 = Math.ceil(Math.random() * sides);
                double total = roll + roll2;
                System.out.printf("You rolled a %.0f one die was %.0f and the other was a %.0f", total, roll, roll2);
            }
            System.out.println("\nwould you like to roll again?[y/n]");
            String rollAgain = sc.next();
            if (rollAgain.equalsIgnoreCase("y")) {
                rollDice();
            }
        }

    public static void main(String[] args) {
//        System.out.println(addition(5, 3) );
//        System.out.println(subtraction(5, 3));
//        System.out.println(multiplication(5, 3));
//        System.out.println(division(15, 3));
//        System.out.println(modulus(16, 3));
//        System.out.println(weirdMultiplication(5, 4));
//        System.out.println("Please enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
//        System.out.printf("%d is within the range", userInput);
        factorial();
//        rollDice();







    }

}

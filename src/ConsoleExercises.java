import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %1.2f", pi);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a integer:");
//        int integer = sc.nextInt();
//        System.out.println(integer);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please type 3 word:");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please type out a sentence:");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width of your room:");
        int width = sc.nextInt();
        System.out.println("Now Please enter the Length of your room:");
        int length = sc.nextInt();
        width *= 2;
        length *= 2;
        int area = width + length;
        System.out.printf("the area of your room is %d", area);
    }
}

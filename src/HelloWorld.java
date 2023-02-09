import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        int myFavoriteNumber = 23;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "This is my string";
//        System.out.println(myString);
//        myString = 'a';
//        myString = 3.14159;

//        long myNumber;
//     myNumber = 3.14;
//      myNumber = 123L;
//        myNumber = 123;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int class;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three"; // because the it needs a string callout as it's explicit to create a string data type

//        int x = 4;
//        x = x + 5;
//            x++;

//        int x = 3;
//        int y = 4;
//       y = y * x;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        x /= y;
//        y -= x;


//    int x = Integer.MAX_VALUE;
//        System.out.println(x);




//        double pi = 3.14159;
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

import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//
//        }
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }  while(i <= 100 );


//        int i = 100;
//                do {
//            System.out.println(i);
//            i -= 5;
//        }  while(i >= -10 );

//       long i = 2L;
//        System.out.println(i);
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for (int i = 100; i >= -10; i-= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2L; i <= 1000000; i*=i ) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <=100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("please enter a number:");
//        int num = sc.nextInt();
//            System.out.println("Here is your table!");
//        System.out.println("Number  | Squared  | Cubed");
//        System.out.println("- - - - - | - - - - -  | - - - - -");
//        int squared;
//        int cubed;
//
//        for (int i = 1; i <= num; i++) {
//            squared = i * i;
//            cubed = i * i * i;
//            if(i == 1) {
//                System.out.printf("   %d      |     %d      |   %d  %n", i, squared, cubed);
//            } else if(i > 1 && i <= 3) {
//                System.out.printf("   %d      |     %d      |   %d  %n", i, squared, cubed);
//
//            } else if(i > 3) {
//                System.out.printf("   %d      |     %d     |   %d  %n", i, squared, cubed);
//
//            }
//
//        }

        System.out.println("Please pick a Number between 0 - 100");
        byte grade = sc.nextByte();

        if (grade >= 99) {
            System.out.println("A+");
        } else if (grade >= 88) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 67) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }




    }
}

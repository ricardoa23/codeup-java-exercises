import java.util.Scanner;

public class Bob {

        public static void main(String[] Args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please ask a question");
           String question = sc.nextLine();
            if(question.endsWith("?")){
                System.out.println("Sure.");
            } else if(question.endsWith("!")) {
            System.out.println("Whoa, chill out!");
            } else if(question.equals("")) {
                System.out.println("Fine. Be that way!");
            } else  {
                System.out.println("Whatever.");
            }
        }
    }

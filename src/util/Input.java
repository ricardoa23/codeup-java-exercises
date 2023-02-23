package util;

import java.util.Scanner;

public class Input {

private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    };

    @Override
    public String toString() {
        return "Input{" +
                "scanner=" + scanner +
                '}';
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.next();
    }

public boolean yesNo() {
      String input = this.getString();
    return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
}
//
public int getInt(int min, int max){
    int input = Integer.parseInt(this.getString());
    try {
        while (input < min || input > max) {
            System.out.printf("please enter a number between %d and %d\n", min, max);
            input = Integer.parseInt(this.getString());
        }
    } catch (NumberFormatException nfx) {
        System.out.println("Exception caught: " + nfx.getMessage());
    }
    return input;
}

public int getInt() {
    return Integer.parseInt(this.getString());
}


public double getDouble(double min, double max){
    double input = Double.parseDouble(this.getString());
    try {
            while (input < min || input > max) {
                System.out.printf("please enter a number between %f and %f\n", min, max);
                input = Double.parseDouble(this.getString());
            }
        } catch (NumberFormatException nfx) {
        System.out.println("Exception caught: " + nfx.getMessage());
    }
    return input;
}

public double getDouble(){
    return Double.parseDouble(this.getString());

}

}

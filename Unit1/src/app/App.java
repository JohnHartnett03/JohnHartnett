package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number1 = input.nextInt();

        System.out.println("Enter another number");
        int number2 = input.nextInt();

        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        int function = input.nextInt();

        if (function == 1){
            System.out.println(number1 + number2);
        }

        if (function == 2){
            System.out.println(number1 - number2);
        }

        if (function == 3){
            System.out.println(number1 * number2);
        }
        if (function == 4){
            System.out.println(number1 / number2);
        }

    }   
}
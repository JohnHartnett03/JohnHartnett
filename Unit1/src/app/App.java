package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number1 = input.nextInt();

        System.out.println("Enter another number");
        int number2 = input.nextInt();

        System.out.println("Enter a function");
        String function = input.nextLine();

        if (function.equals("+")){
            System.out.println(number1 + number2);
        }

        if (function.equals("*")){
            System.out.println(number1 * number2);
        }

        if (function.equals("-")){
            System.out.println(number1 - number2);
        }

        if (function.equals("/")){
            System.out.println(number1 / number2);
        }

        

        

        
    }
}
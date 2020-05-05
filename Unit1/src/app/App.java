package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What number is after 100?");
        String password = input.nextLine();


        if (password.equals("101")){
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }



            System.out.println("What is the capitol of Minnesota?");
        String password2 = input.nextLine();


        if (password2.equals("St. Paul")){
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        
        }

        System.out.println("What is the date?");
        String password3 = input.nextLine();


        if (password3.equals("5/5/2020")){
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
    }
}
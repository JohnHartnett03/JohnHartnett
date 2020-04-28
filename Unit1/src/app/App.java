package app;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name");
        String name = input.nextLine();
        System.out.println("What is your last name?");  
        String lastName = input.nextLine();
        System.out.println("What is your favorite color?");
        String color = input.nextLine();
        System.out.println("How old are you?");
        String age = input.nextLine();
        System.out.println("what grade are you in?");
        String grade = input.nextLine();
        
        System.out.println("Hello " + name + lastName + "! You are " + age + " and in grade " + grade +". Your favorite color is " + color);
        
        

    }

}
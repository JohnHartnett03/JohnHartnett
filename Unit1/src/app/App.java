package app;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);


       System.out.println("Please create a username.");

       String username = input.nextLine();

      System.out.println("Please create a password.");

      String password = input.nextLine();

      System.out.println("How much money do you have?");

      int total = input.nextInt();

      System.out.println("Account created");

      System.out.println("Please enter your username.");

      String username2 = input.nextLine();
      
       if (username2.equals(username)){
           System.out.println("Please enter your password.");

           String password2 = input.nextLine();
                if (password2.equals(password)){
                    System.out.println("Login succesfull.");
                }
                else {
                    System.out.println("Incorrect.");
                }
        }
        
        else {
            System.out.println("incorrect");
        }

       

      
    }   
}
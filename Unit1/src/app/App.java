package app;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

        boolean correct = false;

        Scanner input = new Scanner(System.in);


       System.out.println("Please create a username.");

       String username = input.nextLine();

      System.out.println("Please create a password.");

      String password = input.nextLine();

      System.out.println("How much money do you have?");

      int total = input.nextInt();
      input.nextLine();

      System.out.println("Account created");

      System.out.println("Please enter your username.");

      String username2 = input.nextLine();
      
       if (username2.equals(username)){
           System.out.println("Please enter your password.");

           String password2 = input.nextLine();
                if (password2.equals(password)){
                    System.out.println("Login succesfull.");
                    correct = true;
                }
                else {
                    System.out.println("Login failed.");
                    
                }
        }
        
        else {
            System.out.println("Login failed.");
        }
        if (correct == true){
        System.out.println("You have " + total + " dollars.");
        System.out.println("Press 1 to deposite money.");
        System.out.println("Press 2 to withdraw money.");
        System.out.println("Press 3 to change your password.");

        int function = input.nextInt();

        if (function == 1){
            System.out.println("How much money would you like to deposite.");

            int deposite = input.nextInt();

            System.out.println("Your new total is " + (total + deposite) + ".");
        }

        if (function == 2){
            System.out.println("How much money would you like to withdraw.");

            int withdraw = input.nextInt();

            System.out.println("Your new total is " + (total - withdraw) + ".");
        }

        if (function == 3){
            System.out.println("What would you like your new password to be?.");

            password = input.nextLine();

            System.out.println("Your new password if " + password + ".");
        }

    }
       

      
    }   
}
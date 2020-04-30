package app;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the count");

        int number = input.nextInt();
        
        for (int i = 1; i <= number; i ++){
            System.out.println(i);
        }
        
        

    }

}
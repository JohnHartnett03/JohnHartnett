package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Name a name");
        String name = input.nextLine();

        System.out.println("Name an adjective");
        String adjective = input.nextLine();

        System.out.println("Name another adejctive");
        String adjective2 = input.nextLine();

        System.out.println("Name a food");
        String food = input.nextLine();

        System.out.println("Name a place");
        String place = input.nextLine();

        System.out.println("Name a past tense verb");
        String verb1 = input.nextLine();

        System.out.println("Name a verb");
        String verb2 = input.nextLine();
        
        System.out.println("Name a animal");
        String animal = input.nextLine();
        
        System.out.println("Name a plural noun");
        String noun = input.nextLine();

        System.out.println("Name a liquid");
        String liquid = input.nextLine();

        System.out.println("Name person");
        String person = input.nextLine();

        System.out.println("Hello! my name is " + name + "and I have a story to tell you.");
        System.out.println("It was a " + adjective + ", cold November Day. I woke up to the " + adjective2 + "smell of " + food + "roasting in the " + place + "downstairs.");
        System.out.println("Yes I live up stairs from " + place + ". I " + verb1 + "down the stairs to see if I could help " + verb2 + "the food.");
        System.out.println("My mom said, take these fresh " + noun + "to the table.");
        System.out.println("So I carried a tray full of " + noun + "and a pitcher full of " + liquid + "to the table.");
        System.out.println("And sitting at the table was none other than " + person + "!");
        System.out.println("I got so excited that I dropped the tray! This is the stroy about how I met " + person + ".");

        
    }
}
package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

       Dog dog1 = new Dog();
       Dog dog2 = new Dog();
       Dog dog3 = new Dog();

       dog1.name = "Bodhi";
       dog2.name = "Bill";
       dog3.name = "Joe";

       dog1.breed = "Golden";
       dog2.breed = "Black lab";
       dog3.breed = "Huskey";

       dog1.age = 2;
       dog2.age = 3;
       dog3.age = 6;

       dog1.color = "red";
       dog2.color = "brown";
       dog3.color = "black";

       dog1.height = 1.5;
       dog2.height = 3;
       dog3.height = 4;

       dog1.barks = "barks";
       dog2.barks = "does not bark";
       dog3.barks = "barks";

       System.out.println("I have 3 dogs. The youngest is " + dog1.name + ".");
       System.out.println("He is a " + dog1.breed + " and is " + dog1.age + ".");

       System.out.println("The second oldest is " + dog2.name + ".");
       System.out.println("He is a " + dog2.breed + " and is " + dog2.age + ".");

       System.out.println("The oldest is " + dog3.name + ".");
       System.out.println("He is a " + dog3.breed + " and is " + dog3.age + ".");
    }   
}
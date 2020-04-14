package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "blue";
        boolean sixFeetTall = true;
        while (count <= 10) {
            System.out.println(count);
            count = count + 1;
        }
        
        while (color == "blue"){
            System.out.println("John is Happy");

            color = "red";
        }

        while (sixFeetTall == true){
            System.out.println("You are really tall!");

            sixFeetTall = false;
        }
        
        if (count > 10) {
            System.out.println("I can count to 10");
            
        }

        if (color == "red"){
            System.out.println("John is sad");
        }

        if (sixFeetTall == false){
            System.out.println("You are really short.");
        }
    }
}
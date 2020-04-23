package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Double or single digit?");
        for (int i = 20; i >=1; i --){
            if (i >= 10){
                System.out.println(i + " is a double digit");
            }
            else {
                System.out.println(i + " is a single digit");
            }
        }
        System.out.println("Nice!");
        System.out.println("Fast food");
        for (int v = 1; v <= 10; v ++){
            if (v % 2 == 0){
                System.out.println("Fries");
           }
           else{
               System.out.println("Burgers");
           }
        } 
        System.out.println("Nice!"); 
    }

}
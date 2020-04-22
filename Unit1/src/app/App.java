package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start first loop");
        for(int i = 20; i >= 0; i --){
            if(i == 10){
                for(int v = 0; v <= 6; v ++){
                    System.out.println("10");
                }
            }
            System.out.println(i);
        }
        System.out.println("End First loop");
        System.out.println("Start second loop");
        System.out.println("Hey!");
        for(int r = 1; r <=9; r ++){
            System.out.println(r * 4);
            if (r % 3 == 0){
                System.out.println("Hey!");
            }
        }
    }

}
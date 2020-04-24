package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start first loop");
        for (int i = 1; i <=10; i ++){
            if (i == 5){
                System.out.println("five");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("End First loop");
        System.out.println("Start second loop");
        for (int v = 10; v <= 20; v ++){
            if (v == 16){
                for (int k = 151; k <= 159; k ++){
                    System.out.println(k);
                }
            }
                 System.out.println(v * 10);
            

        }
        System.out.println("End second loop");
    }

}
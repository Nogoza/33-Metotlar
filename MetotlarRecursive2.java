package Metotlar;

public class MetotlarRecursive2 {

    public static int f(int x) {
        if(x == 10){
            System.out.println("Döngü içi: " + x);
            return 10;
        }
        System.out.println("Döngü içi2: " + x);
        return x + f(x+1);
    }




    public static void main(String[] args) {
        System.out.println("Son: " + f(0));


        /*
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += i+1;
            System.out.println(sum);
        }
        System.out.println(sum);

         */
    }
}

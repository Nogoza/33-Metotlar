package Metotlar;

//Recursive Fonksiyonlar -- bir fonksiyonun kendi kendini çağırmasıdır --

public class MetotlarRecursive {

    static int f(int n) {
        System.out.println(n);
        if( n == 1){
            return 1;
        }
        return f(n-1);
    }

    public static void main(String[] args) {
        f(6);
    }
}

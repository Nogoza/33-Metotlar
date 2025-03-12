package Metotlar;

public class MetotlarOverLoading {
    static void print(){
        System.out.println("Parametresiz Metot.");
    }
    static void print(int a){
        System.out.println("Parametreli Metot: " + a);
    }
    static int print(int a, int b){
        System.out.print("return Parametreli Metot: ");
        return (a + b);
    }
    public static void main(String[] args) {
        print();
        print(12);
        int a1 = 12;
        int b1 = 15 ;
        int dene = print(a1,b1);
        System.out.println(dene);
    }
}

package Metotlar;

public class MetotlarP2 {
    static int power(int base, int exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(power(2, 4));
    }
}

package Metotlar;
import java.util.Scanner;

public class MetotlarP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = input.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();

        int result = 1;

        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println(result);

    }
}

package syntaxe;
import java.util.Scanner;

public class EXERCICE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        float f = (float) a / b;
        System.out.println("la somme est :" + c);
        System.out.println("la soustraction est :" + d);
        System.out.println("la produit est :" + e);
        System.out.println("la division est :" + f);
    }
}
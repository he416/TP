package syntaxe;

import java.util.Scanner;

public class EXERCICE3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("veulliez svp entrer la valeure des deux entier :");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c;
    c = a;
    a = b;
    b = c;
    System.out.println("la valeuur de a est :"+a);
    System.out.println("la valeuur de b est :"+b);
}
}

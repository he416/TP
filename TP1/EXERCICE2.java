package syntaxe;

import java.util.Scanner;

public class EXERCICE2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("veuillez donner le rayon du cercle :");
    double r= sc.nextDouble();
    double s = Math.PI * Math.pow(r, 2);
    double p = Math.PI * 2 * r;
    System.out.println("la surface est : "+s);
    System.out.println("la perimetre est : "+p);
}
}

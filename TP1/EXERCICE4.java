package syntaxe;

import java.util.Scanner;

public class EXERCICE4 {
	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" veulliez entrer la valeure du réelle X et la valeur de l'entier a successivement :'");
        double X = sc.nextDouble();
        int n = sc.nextInt();
        double f = Math.pow(X, n);
        System.out.println("la Puissance est :"+f);

	    }
	    }

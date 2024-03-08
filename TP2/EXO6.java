package TP2;
import java.util.Scanner;
public class EXO6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("veulliez entrez un nombre entier positif : ");
	        int nombre = scanner.nextInt();
	        boolean Premier = nbrPremier(nombre);
	        if (Premier) {
	            System.out.println(nombre + " est un nombre premier.");
	        } else {
	            System.out.println(nombre + " n'est pas un nombre premier.");
	        }
	    } 
	    public static boolean nbrPremier(int nombre) {
	        if (nombre <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(nombre); i++) {
	            if (nombre % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
//partie 2//
/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez un nombre N : ");
    int N = scanner.nextInt();
    System.out.println("Les nombres premiers entre 1 et " + N + " sont :");
    for (int i = 2; i <= N; i++) {
        if (Premier(i)) {
            System.out.print(i + " ");
        }
    }
}

public static boolean Premier(int nombre) {
    if (nombre <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(nombre); i++) {
        if (nombre % i == 0) {
            return false;
        }
    }
    return true;
}
}
*/
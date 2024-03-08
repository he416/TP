package TP3;
import java.util.Scanner;
public class exo6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];
        System.out.println("Entrez les valeurs du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }
        System.out.println("Tableau initial :");
        afficherTableau(tableau); 
        int[] tableauPositif = new int[taille]; 
        int[] tableauNegatif = new int[taille]; 
        int taillePositif = 0; 
        int tailleNegatif = 0; 
        for (int i = 0; i < taille; i++) {
            if (tableau[i] > 0) {
                tableauPositif[taillePositif] = tableau[i];
                taillePositif++;
            } else if (tableau[i] < 0) {
                tableauNegatif[tailleNegatif] = tableau[i];
                tailleNegatif++;
            }
        }
        System.out.println("Tableau des valeurs positives (TP) :");
        afficherTableau(tableauPositif, taillePositif);

        System.out.println("Tableau des valeurs n�gatives (TN) :");
        afficherTableau(tableauNegatif, tailleNegatif);
    }
    public static void afficherTableau(int[] tableau, int taille) {
        for (int i = 0; i < taille; i++) {
            System.out.println("Index " + i + " : " + tableau[i]);
        }
    }
    
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Index " + i + " : " + tableau[i]);
        }
    }
}

package TP2;
import java.util.Scanner;

public class EXO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("veuillez svp entrez le nombre N : ");
        int N = scanner.nextInt();
        int somme = 0;
        long produit = 1; 
        double moyenne;
        int i = 0;
        while (i < N) {
            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            i++;
        }
        moyenne = (double) somme / N;
        afficherResultats(somme, produit, moyenne);
        somme = 0;
        produit = 1;
        i = 0;
        do {
            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            i++;
        } while (i < N);
        moyenne = (double) somme / N;
        afficherResultats(somme, produit, moyenne);
        somme = 0;
        produit = 1;
        for (int j = 0; j < N; j++) {
            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
        }
        moyenne = (double) somme / N;
        afficherResultats(somme, produit, moyenne);
        scanner.close();
    }
    public static void afficherResultats(int somme, long produit, double moyenne) {
        System.out.println("La somme est : " + somme);
        System.out.println("Le produit est : " + produit);
        System.out.println("La moyenne est : " + moyenne);
    }
}

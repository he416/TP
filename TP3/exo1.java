package TP3;
import java.util.Scanner;
public class exo1 {
		  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Entrez le nombre N SVP: ");
		        int N = scanner.nextInt();

		        int somme = 0;
		        int produit = 1;
		        int nombre;
		        int compteur = 0;

		        System.out.println("Entrez " + N + " nombres entiers SVP: ");
		        while (compteur < N) {
		            nombre = scanner.nextInt();
		            somme += nombre;
		            produit *= nombre;
		            compteur++;
		        }

		        double moyenne = (double) somme / N;

		        System.out.println("Somme : " + somme);
		        System.out.println("Produit : " + produit);
		        System.out.println("Moyenne : " + moyenne);

		    }
		}
//parit 2//
public class exercice1_2 {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Entrez le nombre N SVP : ");
		        int N = scanner.nextInt();

		        int somme = 0;
		        int produit = 1;
		        int nombre;
		        int compteur = 0;

		        System.out.println("Entrez " + N + " nombres entiers SVP : ");
		        do {
		            nombre = scanner.nextInt();
		            somme += nombre;
		            produit *= nombre;
		            compteur++;
		        } while (compteur < N);

		        double moyenne = (double) somme / N;

		        System.out.println("Somme : " + somme);
		        System.out.println("Produit : " + produit);
		        System.out.println("Moyenne : " + moyenne);

		    }

}
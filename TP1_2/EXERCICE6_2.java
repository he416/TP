package TP1_2;
import java.util.Scanner;
public class EXERCICE6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le poids en kg : ");
        double poids = scanner.nextDouble();
        System.out.print("Entrez la taille en m�tres : ");
        double taille = scanner.nextDouble();
        System.out.print("Entrez le sexe (F pour femme, H pour homme) : ");
        char sexe = scanner.next().charAt(0);
        double imc = poids / (taille * taille);
        System.out.println("L'IMC est : " + imc);
        String etatPoids = determinerEtatPoids(imc, sexe);
        System.out.println("�tat de poids : " + etatPoids);
    }
    public static String determinerEtatPoids(double imc, char sexe) {
        if (sexe == 'F') {
            if (imc < 19) {
                return "Maigreur";
            } else if (imc >= 19 && imc <= 24) {
                return "Poids normal";
            } else if (imc >= 24 && imc <= 30) {
                return "Surcharge pond�rale";
            } else if (imc >= 30 && imc <= 40) {
                return "Adiposit�";
            } else {
                return "Ob�sit�";
            }
        } else if (sexe == 'H') {
            if (imc < 20) {
                return "Maigreur";
            } else if (imc >= 20 && imc <= 25) {
                return "Poids normal";
            } else if (imc >= 25 && imc <= 30) {
                return "Surcharge pond�rale";
            } else if (imc >= 30 && imc <= 40) {
                return "Adiposit�";
            } else {
                return "Ob�sit�";
            }
        } else {
            return "Sexe non valide";
        }
    }
}
package TP1_2;
import java.util.Scanner;
public class EXERCICE7_ {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("veulliez svp entrez l'�ge de l'habitant : ");
        int age = scanner.nextInt();
        System.out.print("veulliez entrer le sexe de l'habitant (M = masculin, F = f�minin) : ");
        char sexe = scanner.next().charAt(0);
        boolean imposable = estImposable(age, sexe);
        if (imposable) {
            System.out.println("L'habitant est imposable");
        } else {
            System.out.println("L'habitant n'est pas imposable");
        }
	}
    public static boolean estImposable(int age, char sexe) {
        if (sexe == 'M') {
            return age > 20;
        } else if (sexe == 'F') {
            return age >= 18 && age <= 35;
        } else {
          return false;
        }
    }
}

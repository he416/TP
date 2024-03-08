package TP2;
import java.util.Scanner;
public class EXO2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("veulliez entrez la valeur de X : ");
        int X = sc.nextInt();
        System.out.print("veulliez entrez la valeur de N : ");
        int N = sc.nextInt();
        long Res = 1;
        for (int i = 0; i < N; i++) {
            Res*= X;
        }
        System.out.println("Le resultat est: " +Res);
	}
}
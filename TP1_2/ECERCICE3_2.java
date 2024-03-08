package TP1_2;
import javva.util.Scanner;
public class ECERCICE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();  
        boolean estParfait = estNombreParfait(nombre);
        if (estParfait) {
            System.out.println(nombre + " est un nombre parfait.");
        } else {
            System.out.println(nombre + " n'est pas un nombre parfait.");
        }
    }
    
    public static boolean estNombreParfait(int nombre) {
        int sommeDiviseurs = 0;
        
        for (int i = 1; i < nombre; i++) {
            if (nombre % i == 0) {
                sommeDiviseurs += i;
            }
        }
        
        return sommeDiviseurs == nombre;
    }
}

}

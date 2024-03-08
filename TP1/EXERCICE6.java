package syntaxe;
import java.util.Scanner;
public class EXERCICE6 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("veulleiz saisir la valeur de a , b sucessivement: ");
        double a = sc.nextDouble();//a différente de 0
        double b = sc.nextDouble();
        double x1 =-b/a;
        if (a==0){
        System.out.println(" le system admet une infinité de solution");
        }else if(b==0){
        System.out.println("le systeme admet une solution null");
        }else {
        System.out.println("le systeme admet une seule solution x1 "+x1);
        }
     }
}

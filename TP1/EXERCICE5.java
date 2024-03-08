package syntaxe;
import java.util.Scanner;
public class EXERCICE5 {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("veulliez svp entrer la valeure demander :");
	        int n=sc.nextInt();
	        int i;
	        int fact = 1;
	        for (i=1;i<=n;i++){
	            fact = fact*i;
	        }
	        System.out.println("le facterielle = "+fact);
	    }
}

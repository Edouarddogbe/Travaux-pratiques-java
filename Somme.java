
import java.util.Scanner;

public class Somme {
    public static void main (String [] args){
Scanner scanner =  new Scanner(System.in);
System.out.println("veuillez entrer le premier  nombre entier" );
int A =scanner.nextInt();
System.out.println("veuillez entrer le second  nombre entier" );
int B=scanner.nextInt();
int somme =A+B;
System.out.println("la somme de :" +somme);
  }
}
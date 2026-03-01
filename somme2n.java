import java.util.Scanner ;
public class somme2n {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrer le premier entier");
        int a = scanner.nextInt();
        System.out.println("veuillez entrer le deuxieme entier");
        int b = scanner.nextInt();
        int somme = a+b ;
        System.out.println("la somme est:" +somme);
    }
}
import java.util.Scanner;
public class Comparaisonn {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("veuillez entrer le premier entier");
        int a= scanner.nextInt();
         System.out.println("veuillez entrer le deuxieme entier");
        int b= scanner.nextInt();
        if (a<b){
            System.out.println ("le plus petit entier est :"+a); 
        }
        else if (a>b){
            System.out.println ("le plus petit entier est :" +b);
        }  
         else {
            System.out.println ("les deux petit entiers sont egaux :" +a);
        }   
        
    }
}

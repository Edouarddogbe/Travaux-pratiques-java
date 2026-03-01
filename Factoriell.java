import java.util.Scanner ;
public class Factoriell {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("veuillez entrer un nombre");
    int n = scanner.nextInt();
    int result = 1;
    for (int i = 1; i<=n ; i++){
        result = result*1;
    }
    System.out.println("le resultat est :" +result);
    }
}

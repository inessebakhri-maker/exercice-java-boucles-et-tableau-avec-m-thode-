import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {

        damier();
    }

    public static void damier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisis un nombre");
        int n = sc.nextInt();

        int largeur = n;
        int hauteur = n;

        for (int x = 0; x < hauteur; x++) {
            for (int y = 0; y < largeur; y++) {
                int result = x + y ;
                System.out.print("#");

                if ( result % 2 == 0) {
                    System.out.print("-");
                    }
                else if (result % 2 != 0) {
                    System.out.print("-");
                }
                }
                System.out.println();
            }

        }
    }


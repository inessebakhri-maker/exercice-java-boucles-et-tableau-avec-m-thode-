import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
menu();
    }
    public static void menu() {
        System.out.println("1: Afficher Bonjour/ 2: Afficher Aurevoir/ 3:Quitter");
        boolean run = true;
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int i = 1;
        int n = 2;
        int x = 3;

        do {
            if (choice == i) {
                System.out.println("Bonjour");
                System.out.println("1: Afficher Bonjour/ 2: Afficher Aurevoir/ 3:Quitter");
                choice = input.nextInt();
            }
            else if (choice == n) {
                System.out.println("Aurevoir");
                System.out.println("1: Afficher Bonjour/ 2: Afficher Aurevoir/ 3:Quitter");
            choice = input.nextInt();}
            else if (choice == x) {
                run = false;
            }

            } while (run);
                System.out.println("Quitter");

    }
}

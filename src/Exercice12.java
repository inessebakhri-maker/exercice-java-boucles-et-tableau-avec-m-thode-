import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
mdp();
    }
    public static String mdp() {
        boolean run = true;
        String secret = "abcdefg";


        do {

            System.out.print("Entrer votre mot de passe : ");
            Scanner input = new Scanner(System.in);
            String m = input.nextLine();
            if (m.equals(secret)) {
                System.out.println("Bienvenue");
                run = false;
            }
            else {
                System.out.println("Essayer encore ");
            }
            } while (run);

            return secret;

    }
}

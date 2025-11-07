import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {


        System.out.println(factorielle());
    }
    public static int factorielle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Si N = ");
        int n = sc.nextInt();

        int result = 1;
        for (int x = 1; x <= n ; x++){


            result = x * result;



        }
        System.out.print("alors " + n + " "+'!' + '='+ " ");
        return result;
    }
}

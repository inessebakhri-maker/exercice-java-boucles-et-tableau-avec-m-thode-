import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        deviner();
    }
    public static void deviner (){
        Scanner input = new Scanner(System.in);

        boolean num = true;
        int j = (int)(Math.random()*100);


        while (num ) {
            System.out.println("Choisis un nombre entre 1 et 100 : ");
            int number = input.nextInt();



            if (number < j) {
                System.out.println("trop petit " );
            }
            if (number > j){
                System.out.println("trop grand");
            }
            else if(number == j){
                System.out.println("correct" + j );
                break;
            }

        }
    }
}

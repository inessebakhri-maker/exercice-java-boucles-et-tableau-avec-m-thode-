import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        compte();
    }
    public static int compte(){

        boolean x = true;
        Scanner sc = new Scanner(System.in);


        while (x)
            System.out.println("nombre : ");
            int a = sc.nextInt();
            if (a >= 1){
                int count = a++;
                System.out.println(count);
            }
        else {
            x = false;}


return a ;


    }

}

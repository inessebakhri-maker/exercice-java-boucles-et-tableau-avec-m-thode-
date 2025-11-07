import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
zero();
    }
    public static void zero (){

        boolean x = true;
        Scanner input = new Scanner(System.in);

        int result = 0;

             while (x){
                 System.out.println("Number :");
                 int a = input.nextInt();
                 if (a == 0)
                 {
                     x = false;
                     System.out.println(result);
                 } else  {
                     result = result + a;
                 }

             }


    }
}

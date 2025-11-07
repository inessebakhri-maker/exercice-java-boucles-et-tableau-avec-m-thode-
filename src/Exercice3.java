import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
multiplication();
    }
    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int result = i*n ;
            System.out.println(i + "*" + n + " = " + result);

        }

    }
}

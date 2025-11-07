import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
fibonnacci(10);

        int n = sc.nextInt();
        System.out.println();
    }
public static void fibonnacci(int x){
        int count = 0;
for (int n = 0; n <= x;n++ ){
    count++;
    System.out.print(" " + (n++));


}


}
}

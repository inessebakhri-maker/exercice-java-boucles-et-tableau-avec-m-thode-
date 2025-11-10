import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        temp();
    }
    public static void temp (){
    Scanner sc = new Scanner(System.in);
        System.out.println("1.Celsius vers Fahrenheit / 2.Fahrenheit vers Celsius / 3.Quitter");
        int choice = sc.nextInt();
        boolean run = true;


        do {
            if (choice == 1) {
                System.out.println("Entrer une temperature en Celsius ");
                int temperature = sc.nextInt();
                int fahrenheit = (temperature * 9/5) + 32 ;
                System.out.println("Devient : " + fahrenheit + "°F");
                System.out.println("1.Celsius vers Fahrenheit / 2.Fahrenheit vers Celsius / 3.Quitter");
                choice = sc.nextInt();
            }

                else if (choice == 2){
                    System.out.println("Entrer un temperature en Fahrenheit ");
                    int temperature2 = sc.nextInt();
                    int celsius = (temperature2 - 32) * 5/9 ;
                    System.out.println("Devient : "+ celsius + "°C");
                System.out.println("1.Celsius vers Fahrenheit / 2.Fahrenheit vers Celsius / 3.Quitter");
                choice = sc.nextInt();
                }
                else if (choice == 3) {
                    run = false;

                }
        }

        while (run); {
        System.out.println("Quitter");
        }




    }
}

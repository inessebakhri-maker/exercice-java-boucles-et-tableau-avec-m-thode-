import java.util.Scanner;

public class Exercice18 {
    public static void main(String[] args) {
tabb();
    }
    public static void tabb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de nombre contiendra votre tableau : ");
        int s = sc.nextInt();
        int [] array = new int [s];
        for (int i = 0; i < s; i++) {
            System.out.println("Entrez chaque nombre de votre tableau : ");
                array[i] = sc.nextInt();
        }
        for (int each : array) {
            System.out.println(each);
        }


//        if (s == 1 ) {
//            int [] array = new int [s];
//            System.out.println("Entrez chaque nombre de votre tableau : ");
//            for(int i = 0; i < s; i++){
//                array[i] = sc.nextInt();
//                System.out.println(array);
//            }
//        }
//        if (s == 2){
//            int [] array2 = new int [s];
//            System.out.println("Entrez chaque nombre de votre tableau : ");
//            for(int i = 0; i < s; i++){
//                array2[i] = sc.nextInt();
//                System.out.println(array2);
//            }
//
//        }
//         if (s == 3) {
//             int[] array3 = new int[s];
//             System.out.println("Entrez chaque nombre de votre tableau : ");
//             for (int i = 0; i < s; i++) {
//                 array3[i] = sc.nextInt();
//                 System.out.println(array3.length);
//             }
//         }
//        if (s == 4) {
//            int[] array4 = new int[s];
//            System.out.println("Entrez chaque nombre de votre tableau : ");
//            for (int i = 0; i < s; i++) {
//                array4[i] = sc.nextInt();
//            }
//        }
//       if (s == 5) {
//           int[] array5 = new int[s];
//           System.out.println("Entrez chaque nombre de votre tableau : ");
//           for (int i = 0; i < s; i++) {
//               array5[i] = sc.nextInt();
//           }
//       }
//       if (s == 6) {
//           int[] array6 = new int[s];
//           System.out.println("Entrez chaque nombre de votre tableau : ");
//           for (int i = 0; i < s; i++) {
//               array6[i] = sc.nextInt();
//           }
//       }
//        if (s == 7) {
//            int[] array7 = new int[s];
//            System.out.println("Entrez chaque nombre de votre tableau : ");
//            for (int i = 0; i < s; i++) {
//                array7[i] = sc.nextInt();
//            }
//        }
//        if (s == 8){
//            int [] array8 = new int [s];
//            System.out.println("Entrez chaque nombre de votre tableau : ");
//        }
//       if (s == 9){
//            int [] array9 = new int [s];
//            System.out.println("Entrez chaque nombre de votre tableau : ");
//        }
//        if (s == 10){
//            int [] array10 = new int [s];
//            System.out.println("Entrez chaque nombre de votre tableau : ");
//        }
    }
}

import java.util.Scanner;

public class Exercice16 {
    public static void main(String[] args) {
moyenne();
    }
    public static void moyenne(){

        int [] notes = {16,7,11,9,13};

        for(int note : notes){
            int moy = (notes[0] + notes[1]+ notes[2] + notes [3] + notes [4]) / 5 ;
            System.out.println("La moyenne est : " + moy); }

        int ecart = notes[0] - notes[1] ;
        System.out.println("Entre les notes 16 et 7 l'écart est de "+ ecart );

        int ecart2 = notes[1] - notes[2] ;
        System.out.println("Entre les notes 7 et 11 l'écart est de "+ ecart2);

        int ecart3 = notes[2] - notes [3] ;
        System.out.println("Entre les notes 11 et 9 l'écart est de "+ ecart3);

        int ecart4 = notes[3] - notes [4] ;
        System.out.println("Entre les notes 9 et 13 l'écart est de "+ ecart4);

    }
}

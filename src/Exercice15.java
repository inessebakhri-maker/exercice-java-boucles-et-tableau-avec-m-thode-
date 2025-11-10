public class Exercice15 {
    public static void main(String[] args) {
min();
    }
    public static void min (){
        int [] valeurs = {2, -1 , 6,  -5, 3 , 10, 4} ;
        int valeur = valeurs[0];
        for (int i = 1; i < valeurs.length; i++){
            // valeurs[i] 1 = -1 / 6 / -5
            if (valeur > valeurs[i]){
                valeur = valeurs[i];
            }
        }
        System.out.println("Le minimum est = " + valeur);
    }
}

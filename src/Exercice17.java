public class Exercice17 {
    public static void main(String[] args) {
compare();
    }
    public static void compare (){

        int [] array = {5,3,-2,0,-6,6,1,-4};

        int nulls = 0;
        int positif = 0;
        int negative = 0;
            for (int nombre : array ){

            if(nombre == 0){
                nulls++;
            }
            else if (nombre > 0){
                positif++;
            }
            else if (nombre < 0){
                negative++;
            }

            }

        System.out.println("Positifs : " + positif );
        System.out.println("Negatives : " + negative );
        System.out.println("Nulls : " + nulls );
        }
    }


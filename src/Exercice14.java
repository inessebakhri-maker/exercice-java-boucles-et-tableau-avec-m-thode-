public class Exercice14 {
    public static void main(String[] args) {
multarray();
    }
    public static void multarray (){

        int [] valeurs = new int [5];
        valeurs[0] = 5;
        valeurs[1] = 2;
        valeurs[2] = 9;
        valeurs[3] = 1;
        valeurs[4] = 7;

        for ( int mult = 0; mult < valeurs.length; mult++ ) {
            int result = valeurs[0] * valeurs[1] * valeurs[2] * valeurs[3] * valeurs[4];
            System.out.print(valeurs[0]+ "x" + valeurs[1] + "x" + valeurs[2] + "x" + valeurs[3] + "x" + valeurs[4]);
            System.out.println(" = " + result);
        }


    }
}

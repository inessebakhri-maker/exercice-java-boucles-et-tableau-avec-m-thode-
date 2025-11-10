public class Exercice13 {
    public static void main(String[] args) {
        arrays();
    }
    public static void arrays(){

//

        int[] tabb = {2,4,6,8};
        for(int i=0;i<tabb.length; i++){
            System.out.println(i + "=" + tabb[i]);
        }

        int[] doubb = new int[tabb.length];


        for (int i=0;i<doubb.length; i++){
            int somme = tabb[i] * 2;
            System.out.println(i + "=" + somme);
        }
    }
}

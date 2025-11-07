public class Exercice1 {
    public static void main(String[] args) {
        multiple(3);
    }
    public static void multiple(int mult) {
        int result = 1;

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 1) {
                System.out.println(i);
            }
        }

    }
}


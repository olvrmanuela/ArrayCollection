public class MultiplosDeQuatro {
    public static void main(String[] args) {
        int quantidade = 100;
        int numero = 4;
        int[] multiplos = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            multiplos[i] = numero * (i + 1);
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println(multiplos[i]);
        }
    }
}

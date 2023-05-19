public class MediaArray {
    public static void main(String[] args) {
        double[] array = {2.5, 4.8, 6.2, 3.9, 1.7, 9.5, 7.3, 5.1, 8.6, 3.4};
        double media = calcularMedia(array);

        System.out.println("A média é: " + media);
    }

    public static double calcularMedia(double[] array) {
        double soma = 0;
        for (double elemento : array) {
            soma += elemento;
        }
        return soma / array.length;
    }
}

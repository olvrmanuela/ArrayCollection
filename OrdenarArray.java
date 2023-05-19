import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        int[] arrayOrdenado = ordenarArray(array);

        System.out.println(Arrays.toString(arrayOrdenado));
    }

    public static int[] ordenarArray(int[] array) {
        int[] novoArray = Arrays.copyOf(array, array.length);
        Arrays.sort(novoArray);
        return novoArray;
    }
}

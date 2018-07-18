import java.util.Comparator;

public class BubbleSort {

    /* Metodo estático Genérico para ordenar um vetor de qualquer tipo "T" de Objeto "Comparable", ou seja, qualquer
     * objeto de classe que implemente a interface "Comparable<>" */
    public static <T extends Comparable<T>> T[] sort(T[] vector) {
        /* Primeiro copio o vetor */
        T[] sorted = vector.clone();
        T aux;

        /* Agora ordeno o vetor com o algoritmo de "Bubble Sort" e o método compareTo implementado para o tipo "T" */
        for (int i = 0; i < vector.length; i++) {
            for (int j = i; j < vector.length; j++) {
                if (sorted[i].compareTo(sorted[j]) > 0) {
                    aux = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = aux;
                }
            }
        }

        return sorted;
    }
}

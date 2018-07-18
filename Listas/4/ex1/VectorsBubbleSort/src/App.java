import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);

    public static void main (String args[]) {
        Integer intVector[];
        Double doubleVector[];
        String stringVector[];

        /* Leitura do vetor de inteiros */
        intVector = new Integer[input.nextInt()];
        for (int i = 0; i < intVector.length; i++) {
            intVector[i] = input.nextInt();
        }

        /* Leitura do vetor de Doubles */
        doubleVector = new Double[input.nextInt()];
        for (int i = 0; i < doubleVector.length; i++) {
            doubleVector[i] = input.nextDouble();
        }

        /* Leitura do vetor de Strings */
        stringVector = new String[input.nextInt()];
        for (int i = 0; i < stringVector.length; i++) {
            stringVector[i] = input.next();
        }

        /* Utilização da Classe BubbleSort para ordenação dos vetores */
        intVector = BubbleSort.<Integer>sort(intVector);
        doubleVector = BubbleSort.<Double>sort(doubleVector);
        stringVector = BubbleSort.<String>sort(stringVector);

        /* Impressão dos vetores ordenados */
        for (Integer num: intVector) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (Double dec: doubleVector) {
            System.out.print(dec + " ");
        }
        System.out.println();

        for (String str: stringVector) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

}

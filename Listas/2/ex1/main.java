import java.util.Scanner;

class main{
    public static void main(String[] args) {
        int numberOfDates;
        Date[] dates;
        Scanner read = new Scanner(System.in);

        // Leitura do numero de datas
        numberOfDates = read.nextInt();

        // Instancio um array para 'numberOfDates' objetos "Date"
        dates = new Date[numberOfDates];

        // Instanciação de cada objeto "Date" e impressão da data
        for (int i = 0; i < numberOfDates; i++) {
            dates[i] = new Date(read.nextInt(), read.nextInt(), read.nextInt());
            dates[i].displayDate();
        }
    }
}

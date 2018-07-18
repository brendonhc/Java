import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.NotDirectoryException;
import java.util.Scanner;

/**
 * Classe que ordena e numera arquivos '.mp3' a partir de um dado diretório com BubbleSort
 *
 * <p>
 *     Obs.: O makefile contido no zip deste aplicativo contém uma instrução que, se executado em terminal linux
 *     cria um ambiente para teste da aplicação na pasta atual, para tal é necessário rodar os seguintes comandos:
 * </p>
 *
 * <p>make newtest</p>
 * <p>make run</p>
 *
 * <p></p>
 *
 * <p>
 *     Durante a execução, dê como entrada o caminho do diretório atual, ou, um simples ponto "." que significa o mesmo.
 * </p>
 */
public class App {
    public static Scanner input = new Scanner(System.in);

    /* Método responsável por manipular as classes MP3 e BubbleSort para organizar o diretório passado por argumento */
    public static void MP3DirSort(String path) throws Exception {
        File dir = new File(path);
        String[] filesNames;

        /* Filtro para identificar arquivos mp3*/
        FilenameFilter mp3Filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contains(".mp3");
            }
        };

        /* Verificação se o caminho pertence a um diretório válido */
        if (!dir.isDirectory()) throw new NotDirectoryException("O caminho não se refere a um diretório.");

        /* Separo os arquivos de extensão '.mp3' do diretório com o filtro inicializado acima */
        filesNames = dir.list(mp3Filter);;

        /* Crio um vetor de músicas (Objetos da classe "MP3") para os arquivos ordenados */
        MP3[] audios = new MP3[filesNames.length];
        for (int i = 0; i < filesNames.length; i++) {
            audios[i] = new MP3(filesNames[i]);
        }

        /* Ordeno o vetor de músicas segundo o tamanho do arquivo de cada uma, pois, assim foi codificado o
         * "compareTo" da classe MP3, método usado para ordenação em "BubbleSort.sort()" */
        audios = BubbleSort.sort(audios);

        /* Agora renomeio todas as músicas com seus respectivos índices formatados */
        for (int i = 0; i < audios.length; i++) {
            audios[i].normalize(); // Metodo que tira caracteres especiais e numero do nome do MP3
            audios[i].rename(String.format("%04d", i)  + "_" + audios[i].getName()); // Renomeia com o indice
        }


    }

    /* Método main para leitura do caminho do diretório pelo console/terminal e chamada do método ordenador */
    public static void main(String[] args) {
        /* Leitura do caminho onde será feito o procedimento */
        String pathDir = input.next();
        try {
            MP3DirSort(pathDir);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

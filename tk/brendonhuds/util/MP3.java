package tk.brendonhuds.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/**
 * Classe que representa um arquivo MP3 em disco
 *
 * Possui atributos como caminho para o arquivo, nome.
 * Implementa a interface "Comparable" pra poder ser ordenado pelo nome do arquivo.
 *
 */
public class MP3 implements Comparable<MP3> {
    private String name; // Nome do arquivo
    private String path; // Caminho do arquivo
    private String parent; // Diretório "pai" do arquivo
    private File file;
    private Long size;

    MP3(String filePath) throws FileNotFoundException {
        file = new File(filePath);

        /* Verificação da existencia do arquivo */
        if (!file.exists()) throw new FileNotFoundException("Arquivo mp3 não existe!");

        path = file.getPath();
        name = file.getName();
        parent = path.replace(name, "");
        size = file.length(); // Tamanho em bytes
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }

    public String getPath() {
        return path;
    }

    /* Renomeia o arquivo MP3 */
    public void rename(String name) throws FileAlreadyExistsException {
        File newName = new File(parent+name);

        if (newName.exists()) {
            throw new FileAlreadyExistsException("Não foi possível renomear pois o nome '" +
                    name + "' pertence a outro arquivo!");
        }
        else {
            this.name = name;
            path = parent + name;
            file.renameTo(newName);
        }
    }

    public void normalize() throws FileAlreadyExistsException {
        char[] aux = name.toCharArray();
        String newName = "";

        for (int i = 0; i < name.length() - 4/*exclue o .mp3*/; i++) {
            /* Escreve em 'newName' somente os caracteres [a-z] ou [A-Z] */
            if ((aux[i] >= 'a' && aux[i] <= 'z') || (aux[i] >= 'A' && aux[i] <= 'B')) {
                newName = newName + aux[i];
            }
        }
        rename(newName + ".mp3");
    }

    /* CompareTo pelo tamanho do arquivo do MP3 */
    @Override
    public int compareTo(MP3 o) {
        return size.compareTo(o.size);
    }
}

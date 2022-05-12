package Streams_de_caracteres.java_io_writer;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.FileReader;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;


/**
 * Classe utilizada para ler um arquivo e copia-lo.
 */
public class ExemploWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digie o caminho do arquivo de origem: ");
        String org = sc.nextLine();
        System.out.println("Digite o caminho do arquivo de chegada: ");
        String cgd = sc.nextLine();

        copiarArquivos(org, cgd);
    }

    public static  void copiarArquivos(String origem, String destino){
        Reader reader = null;
        Writer writer = null;

        try{
            reader = new FileReader(origem);
            writer = new FileWriter(destino);

            int c;
            while ((c = reader.read()) != -1){
                System.out.print((char) c);
                writer.write(c);
            }
        }catch (FileNotFoundException e){
            System.out.println("Caminho nao encontrado");
        }catch (IOException e){
            System.out.println("");
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            }catch (IOException d){
                System.out.println("Erro ao fechar o arquivo de origem!");
            }

            try {
                if(writer != null){
                    writer.close();
                }
            }catch (IOException e){
                System.out.println("Erro ao fechar o arquivo de destimo!");
            }
        }
    }
}

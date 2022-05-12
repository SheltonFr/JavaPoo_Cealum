package Streams_de_caracteres.java_io_reader;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.FileReader;

public class ExemploReader {
    public static void main(String[] args) {

        String caminho = "C:\\Users\\Admin\\Documents\\estudos\\Java\\JavaPoo_Cealum\\17_Pacote_Java.io\\src\\Streams_de_caracteres\\java_io_reader\\java.io.reader.txt";

        lerArquivos(caminho);
    }

    public static void lerArquivos(String caminho){

        Reader r = null;

        try{
           r =new FileReader(caminho);
           int c;
           while ((c = r.read()) != -1){
               System.out.print((char) c);
           }
        }catch (FileNotFoundException e){
            System.out.println(caminho + "Nao existe!");
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo!");
        } finally {
            try{
                if( r != null ){
                    r.close();
                }
            }catch (IOException e){
                System.out.println("Erro a fechar o arquivo!");
            }
        }

    }
}

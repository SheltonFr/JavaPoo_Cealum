package leitura_de_arquivos.verificarDirectorio;

import java.io.File;
/*Exemplo de um programa que a partir de um caminho,
verifica se este caminho é referente a um diretório ou um arquivo.*/

public class ExemploFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Documents\\estudos\\Java\\JavaPoo_Cealum\\1" +
                "7_Pacote_Java.io\\src\\leitura_de_arquivos\\Leitura de Arquivos.txt");

        if(file.isFile()){
            System.out.println("Caminho de um arquivo");
        }else if(file.isDirectory()){
            System.out.println("Caminho de um directorio");
        }
    }
}

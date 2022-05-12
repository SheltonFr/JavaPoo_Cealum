package leitura_de_arquivos.verificarDirectorio;
import java.io.File;

public class ExemploFileMetodos {
    public static void main(String[] args) {

        String caminho1 = "C:\\Users\\Admin\\Desktop";
        String caminho2 = "C:\\Users\\Admin\\Documents\\estudos\\Java\\JavaPoo_Cealum\\17_Pacote_Java.io\\src\\leitura_de_arquivos\\Leitura de Arquivos.txt";
        verificarCaminho(caminho1);
        verificarCaminho(caminho2);

    }

    public static void verificarCaminho(String caminho){
        File file = new File(caminho);

        System.out.println("Caminho: "+ caminho);

        if(file.isFile()){
            System.out.println("Caminho de arquivo");
        }else if(file.isDirectory()){
            System.out.println("Caminho para directorio");
        }
    }
}

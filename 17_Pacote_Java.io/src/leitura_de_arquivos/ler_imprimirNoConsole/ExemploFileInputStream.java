package leitura_de_arquivos.ler_imprimirNoConsole;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Classe utilizada para ler as informações de um arquivo e imprimir
 * no console.
 */
public class ExemploFileInputStream {
    public static void main(String[] args) {

        String caminho = "C:\\Users\\Admin\\Documents\\estudos\\Java\\JavaPoo_Cealum\\17_Pacote_Java.io\\src\\leitura_de_arquivos\\Leitura de Arquivos.txt";
        lerArquivos(caminho);
    }

    public static void lerArquivos(String caminho){
        FileInputStream fis = null;
        try{
            /*Cria objecto da classe FileInputStream para ler o arquivo*/
            fis = new FileInputStream(caminho);

            int c;
            /*Le o caracter do arquivo e guarda na varavel c, quando o caracter lido for igual a -1,
             significa  que chegou ao final do arquivo. */

                while ((c = fis.read()) != -1 ){
                    System.out.println((char) c);
                }

        } catch (FileNotFoundException e){
            System.out.println("Erro ao procurar o arquivo!");
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo!");
        } finally {

            try {
                if(fis != null){
                    /*Fechar o arquivo que esta sendo lido*/
                    fis.close();
                }
            }catch (IOException e){
                System.out.println("Erro ao fechar o arquivo");
            }

        }

    }
}

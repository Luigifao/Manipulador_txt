package org.example;
import java.io.File;
public class VerificarPermissoes {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\luigi.alves\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\AED3\\Manipula_arquivos\\Manipulador_arq\\src\\main\\java\\org\\example");

        if (arquivo.exists()) {
            System.out.println("Arquivo existe.");
            System.out.println("Permissão de leitura: " + arquivo.canRead());
            System.out.println("Permissão de escrita: " + arquivo.canWrite());
        } else {
            System.out.println("Arquivo não encontrado.");
        }
    }
}

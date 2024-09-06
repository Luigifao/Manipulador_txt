package org.example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Manipulador_txt {
    static String directoryPath = "C:\\Users\\luigi.alves\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\AED3\\Manipula_arquivos\\Manipulador_arq\\src\\main\\java\\org\\example\\meuArquivo.txt"; // Caminho do diretório
    static String matriz = "C:\\Users\\luigi.alves\\OneDrive - FUNDAÇÃO MOVIMENTO DIREITO E CIDADANIA\\AED3\\Manipula_arquivos\\Manipulador_arq\\src\\main\\java\\org\\example\\matriz.txt";
    public static void leitor() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(directoryPath));
        String linha;
        while ((linha = buffRead.readLine()) != null) {
            System.out.println(linha);
        }
        buffRead.close();
    }

    public static String linha(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = buffRead.readLine();
        return linha;
    }

    public static void escritor (String texto) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(directoryPath,true));
        buffWrite.append(texto + "\n");
        buffWrite.close();
    }
    public static void escritor (String texto,String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path,true));
        buffWrite.append(texto + "\n");
        buffWrite.close();
    }
    public static void criar_arq(String nomearq) throws IOException {

        String fileName = nomearq; // Nome do arquivo

        // Cria o objeto File para o diretório
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs(); // Cria o diretório se ele não existir
        }

        // Cria o objeto File para o arquivo
        File file = new File(directoryPath + "/" + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("Arquivo criado: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo");
        }
    }

    public static void deletar_arq(String caminho) throws IOException {
        File arq = new File(caminho);
        if (arq.delete()) {
            System.out.println("Arquivo deletado com sucesso: " + arq.getName());
        } else {
            System.out.println("Falha ao deletar o arquivo.");
        }
    }
    public static void leitura_matriz() throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(matriz));
        String linha = buffRead.readLine();
        montagem_matriz(linha);
        buffRead.close();

    }
    public static boolean montagem_matriz(String linha) throws IOException{
        // posição 0 -> dimensões ; posição 1 -> quantidade de posições zeradas; posição 2 -> posições que serão zeradas
        String dados[] = linha.split(";");
        int largura = Integer.parseInt(dados[0].split("x")[0]);
        int altura = Integer.parseInt(dados[0].split("x")[1]);

        int qunt_zeradas = Integer.parseInt(dados[1]);
        return true;
    }


}
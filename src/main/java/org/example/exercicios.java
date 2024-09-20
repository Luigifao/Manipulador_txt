package org.example;
import java.util.Scanner;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;


public class exercicios {
    static Scanner input = new Scanner(System.in);
    static Manipulador_txt manipulador = new Manipulador_txt();

    static void write_bin(int[] inteiros) throws IOException{
        for (int i = 0; i < inteiros.length; i++){
            String bin = Integer.toBinaryString(inteiros[i]);
            System.out.println("Foi adicionado o "+bin+" ao arquivo");
            Manipulador_txt.escritor(bin);

        }
        System.out.println("todos os numeros foram adicionados com sucesso ! ");
    }

    static void funcionarios() throws IOException{
        for(int i = 0;i<5;i++){
            System.out.print("Digite a profissão do funcionário: ");
            String funcionario = input.nextLine();
            Manipulador_txt.escritor(funcionario);
            System.out.print("Digite o tempo de serviço do funcionário (Em meses): ");
            String tempo = input.nextLine();
            Manipulador_txt.escritor(tempo);
            i++;
        }
        Manipulador_txt.leitor();
    }
    static void cadastro_tel() throws IOException{
        String resposta = "";
        while (resposta != "0"){
            System.out.print("Digite um nome: ");
            String nome = input.nextLine();
            System.out.print("Digite o respectivo número: ");
            String numero = input.nextLine();
            String nome_numero = "Nome: "+nome+" Número: "+numero;
            Manipulador_txt.escritor(nome_numero);
            System.out.println("Digite 0 para interromper a escrita");

        }
    }

    public static void maioridade(String saida, String destino)throws IOException{
        boolean loop = true;
        while (loop = true){
            String linha = Manipulador_txt.linha(saida);
            String nome = linha.split(" ")[0];
            String idade = linha.split(" ")[1];
            int idadenmr = Integer.parseInt(idade);
            if (idadenmr > 18){
                String linhaDestino = "%s é maior de idade com %d anos".formatted(nome,idadenmr);
                Manipulador_txt.escritor(linhaDestino);
            }
            if (idadenmr < 18){
                String linhaDestino = "%s é menor de idade com %d anos".formatted(nome,idadenmr);
                Manipulador_txt.escritor(linhaDestino);
            }
            }

        }
        public static void notas(String path)throws IOException{
            boolean loop = true;
            while (loop){
                String linha = Manipulador_txt.linha(path);
                if (linha == null){
                    break;
                }
                String nome = linha.split(" ")[0];
                int nota1 = Integer.parseInt(linha.split(" ")[1]);
                int nota2 = Integer.parseInt(linha.split(" ")[2]);
                int nota3 = Integer.parseInt(linha.split(" ")[3]);
                int[] notas = {nota1,nota2,nota3};
                bubbleSort(notas);


            }
    }
        public static void notas_finais(String path) throws IOException{
            Manipulador_txt.leitor(path);
        }




    public static void main(String[] args) throws IOException{
        // Exercício 01
//        int[] inteiros = {1,2,3,4,5,6,7,8,9,10};
//        write_bin(inteiros);

        // Exercício 02
//        funcionarios();

        // Exercício 03
//        cadastro_tel();

        // Exercício 04
        // Função no módulo Manipulador_txt com o nome "Leitura_matriz" e montagem_matriz
        
        // Exercício 05
        // maioridade(null, null);

        // Exercício 06
        // notas(null);

        // Exercício 07 
//        Aluno alunos = new Aluno();
//        System.out.println("Digite o endereço do Arquivo: ");
//        String path = input.nextLine();
//        Aluno maior_nota = alunos.encontrarAlunoComMaiorNota(path);
//        System.out.println("O aluno com maior nota é "+maior_nota);

        // Exercício 08
        System.out.println("Digite o caminho do arquivo: ");
        String path = input.nextLine();
        while(true){
            String linha = Manipulador_txt.linha(path);
        }

    }
    // função para ordenar vetores do tipo inteiro
    public static int[] bubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }



}

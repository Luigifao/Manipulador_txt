package org.example;
import java.util.Scanner;
import java.io.IOException;

public class exercicios {
    static Scanner input = new Scanner(System.in);
    static Manipulador_txt manipulador = new Manipulador_txt();

    static void write_bin(int[] inteiros) throws IOException{
        for (int i = 0; i < inteiros.length; i++){
            String bin = Integer.toBinaryString(inteiros[i]);
            System.out.println("Foi adicionado o "+bin+" ao arquivo");
            manipulador.escritor(bin);

        }
        System.out.println("todos os numeros foram adicionados com sucesso ! ");
    }

    static void funcionarios() throws IOException{
        for(int i = 0;i<5;i++){
            System.out.print("Digite a profissão do funcionário: ");
            String funcionario = input.nextLine();
            manipulador.escritor(funcionario);
            System.out.print("Digite o tempo de serviço do funcionário (Em meses): ");
            String tempo = input.nextLine();
            manipulador.escritor(tempo);
            i++;
        }
        manipulador.leitor();
    }
    static void cadastro_tel() throws IOException{
        String resposta = "";
        while (resposta != "0"){
            System.out.print("Digite um nome: ");
            String nome = input.nextLine();
            System.out.print("Digite o respectivo número: ");
            String numero = input.nextLine();
            String nome_numero = "Nome: "+nome+" Número: "+numero;
            manipulador.escritor(nome_numero);
            System.out.println("Digite 0 para interromper a escrita");

        }
    }

    public static void maioridade(String saida, String destino)throws IOException{
        boolean loop = true;
        while (loop = true){
            String linha = manipulador.linha(saida);
            String nome = linha.split(" ")[0];
            String idade = linha.split(" ")[1];
            int idadenmr = Integer.parseInt(idade);
            if (idadenmr > 18){
                String linhaDestino = "%s é maior de idade com %d anos".formatted(nome,idadenmr);
                manipulador.escritor(linhaDestino);
            }
            if (idadenmr < 18){
                String linhaDestino = "%s é menor de idade com %d anos".formatted(nome,idadenmr);
                manipulador.escritor(linhaDestino);
            }
            }

        }
        public static void notas(String path)throws IOException{
            boolean loop = true;
            while (loop){
                String linha = manipulador.linha(path);
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
    }


}

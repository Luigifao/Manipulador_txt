package org.example;

import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable {
    private static final long serialVersionID = 1L;
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public static List<Aluno> lerArquivoBinario(String caminhoArquivo) {
        List<Aluno> alunos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivo))) {
            alunos = (List<Aluno>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public static Aluno encontrarAlunoComMaiorNota(String path) {
        List<Aluno> alunos = lerArquivoBinario(path);
        if (alunos.isEmpty()) {
            return null;
        }
        Aluno alunoComMaiorNota = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.getNota() > alunoComMaiorNota.getNota()) {
                alunoComMaiorNota = aluno;
            }
        }
        return alunoComMaiorNota;
    }
}

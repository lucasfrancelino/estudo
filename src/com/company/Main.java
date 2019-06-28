package com.company;

import cursojava.constantes.StatusAluno;

import javax.swing.*;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {


        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int quantidade = 1; quantidade <= 3; quantidade++) {


            Aluno aluno = new Aluno();

            String nomeEntrada = JOptionPane.showInputDialog("Qual nome do estudante " + quantidade + "?");
            aluno.setNome(nomeEntrada);

            /*Adicionando uma lista de 4 disciplinas, usando o FOR para adicionar a cada posição + 1 da lista*/
            for (int posicao = 1; posicao <= 1; posicao++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Entre com a disciplina " + posicao + " cursando");
                String notaDisciplina = JOptionPane.showInputDialog("Entre com a nota da disciplina " + posicao + "");

                Disciplina disciplina = new Disciplina();

                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));

                aluno.getDisciplina().add(disciplina);
            }


            /*Removendo um item da lista*/


            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina de sua grade");
            if (escolha == 0) {

                int continuarRemover = 0;
                int posicao = 1;
                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Escolha a disciplina que será removida");
                    aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar remover?");
                }
            }
            alunos.add(aluno);

        }


        List<Aluno> alunosAprovados = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();

        /*É uma lista identifica uma chave e retorna um valor (chave valor)*/
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

        maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
        maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());


        for (Aluno aluno : alunos) {
            if (StatusAluno.APROVADO.equalsIgnoreCase(aluno.situacaoAluno())) {
                maps.get(StatusAluno.APROVADO).add(aluno);
            } else if (StatusAluno.RECUPERACAO.equalsIgnoreCase(aluno.situacaoAluno())) {
                maps.get(StatusAluno.RECUPERACAO).add(aluno);
            } else if (StatusAluno.REPROVADO.equalsIgnoreCase(aluno.situacaoAluno())) {
                maps.get(StatusAluno.REPROVADO).add(aluno);
            }
        }

            System.out.println("----------------Lista dos Aprovados----------------");
            for (Aluno listaAluno :maps.get(StatusAluno.APROVADO)) {
                System.out.println(listaAluno.getNome());
                System.out.println("Resultado = "+listaAluno.situacaoAluno()+" com Média de = "+listaAluno.getMediaNota());
            }
            System.out.println("----------------Lista dos em Recuperação----------------");
            for (Aluno listaAluno :maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println(listaAluno.getNome());
                System.out.println("Resultado = "+listaAluno.situacaoAluno()+" com Média de = "+listaAluno.getMediaNota());
            }
            System.out.println("----------------Lista dos Reprovados----------------");
            for (Aluno listaAluno :maps.get(StatusAluno.REPROVADO)) {
                System.out.println(listaAluno.getNome());
                System.out.println("Resultado = "+listaAluno.situacaoAluno()+" com Média de = "+listaAluno.getMediaNota());
            }

    }
}
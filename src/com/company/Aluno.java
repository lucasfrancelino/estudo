package com.company;

import cursojava.constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Getter @Setter @NoArgsConstructor
public class Aluno extends Pessoa{

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private String resultado;
    /*Declarando minnha classe de Disciplina como sendo uma Lista*/
    /*Significa que eu tenho uma lista de Disciplinas*/
    private List <Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    public Aluno() {

    }


    public Aluno(String nomePadrao) {



    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", resultado='" + resultado + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    /**********************************************************************/

    // Instancia primeiro o objeto do tipo Disciplina
    //disciplinaAluno recebera uma lista do tipo disciplina
    public double getMediaNota() {

        double somaNotas = 0.0;

        for (Disciplina disciplinaAluno : disciplinas ) {

            somaNotas += disciplinaAluno.getNota();
        }

        //.size() significa o tamanho do meu array, isso torma meu array dinâmico
        return somaNotas / disciplinas.size();
    }


    public String situacaoAluno() {
        if (getMediaNota() >= 70) {
            resultado = StatusAluno.APROVADO;
        }

        if (getMediaNota() <= 60) {
            resultado = StatusAluno.RECUPERACAO;
        }

        if (getMediaNota() <= 50){
            resultado =  StatusAluno.REPROVADO;
        }

        return resultado;
    }

    @Override
    public boolean pessoaMaiorIdade() {
        return idade >= 18;
    }

    @Override
    public double salario() {
        return 500;
    }

    public String msgMaiorIdade(){
        return this.pessoaMaiorIdade() ? "Aluno maior de idade" : "Aluno menor de idade";
    }
}
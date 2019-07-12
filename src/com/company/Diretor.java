package com.company;

public class Diretor extends Pessoa {

    private String registroEducacional;
    private int tempoDirecao;
    private String titulacao;

    public String getRegistroEducacional() {
        return registroEducacional;
    }

    public void setRegistroEducacional(String registroEducacional) {
        this.registroEducacional = registroEducacional;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }


    @Override
    public double salario() {
        return 6800.00 * 0.3;
    }
}

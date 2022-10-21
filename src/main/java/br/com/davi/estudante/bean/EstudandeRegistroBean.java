package br.com.davi.estudante.bean;

import javax.inject.Named;
import java.io.Serializable;

@Named("estudanteRegistro")     // ALTERANDO O NOME AQUI, DEVEMOS CHAMAR POR ESSE NOME NO JSF.
public class EstudandeRegistroBean implements Serializable {
//    CASO NÃO ALTERÁSSEMOS O NOME, CHAMARIAMOS POR estudanteRegistroBean, NO JSF.
    private String nome = "Davi";
    private String sobrenome = "Visintainer";
    private double nota1;
    private double nota2;
    private double nota3 = 10;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}

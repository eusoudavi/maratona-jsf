package br.com.davi.devdojo.bean.estudante;

import br.com.davi.devdojo.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;

@Named("estudanteRegistro")     // ALTERANDO O NOME AQUI, DEVEMOS CHAMAR POR ESSE NOME NO JSF.
public class EstudandeRegistroBean implements Serializable {
//    CASO NÃO ALTERÁSSEMOS O NOME, CHAMARIAMOS POR estudanteRegistroBean, NO JSF.

    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}

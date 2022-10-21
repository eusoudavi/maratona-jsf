package br.com.davi.devdojo.bean.estudante;

import br.com.davi.devdojo.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named("estudanteRegistro")     // ALTERANDO O NOME AQUI, DEVEMOS CHAMAR POR ESSE NOME NO JSF.
public class EstudandeRegistroBean implements Serializable {
//    CASO NÃO ALTERÁSSEMOS O NOME, CHAMARIAMOS POR estudanteRegistroBean, NO JSF.

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Davi", "Menezes", "Visintainer"};
    private List<String> nomesList = asList("10", "20", "30");
    private Set<String> nomesSet = new HashSet<>(asList("A", "B", "C"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Davi", "Primeiro Nome");
        nomesMap.put("Menezes", "Segundo Nome");
        nomesMap.put("Visintainer", "Último Nome");
    }


    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }
}

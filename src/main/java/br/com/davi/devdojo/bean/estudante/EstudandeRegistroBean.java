package br.com.davi.devdojo.bean.estudante;

import br.com.davi.devdojo.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named("estudanteRegistro")     // ALTERANDO O NOME AQUI, DEVEMOS CHAMAR POR ESSE NOME NO JSF.
@ViewScoped                     // ENQUANTO O USUÁRIO ESTÁ NA PÁGINA, O JAVA TEM QUE MANDATER O ESTADO DAS VARIÁVEIS
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
    private Boolean mostrarNotas;
    private Boolean mostrarLink;

    public void executar(String nome){
        System.out.println("Fazendo uma busca no BD do nome " + nome);
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }
    public String executarRetorno(String nome){
        return "Quem é o lindão? " + nome;
    }
   public String irParaIndex2(){
//        return "index2";
        return "index2?faces-redirect=true"; // USAMOS ESSA ESTRUTURA PARA MOSTRAR NO NAVEGADOR O NOVO ENDEREÇO
    }

    public void exibirNotas(){
        this.mostrarNotas = true;
    }
    public void esconderNotas(){
        this.mostrarNotas = false;
    }

    public void exibirLink(){
        this.mostrarLink = true;
    }

    public void esconderLink(){
        this.mostrarLink = false;
    }


    public Boolean getMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(Boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public Boolean getMostrarNotas() {
        return mostrarNotas;
    }
    public void setMostrarNotas(Boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
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

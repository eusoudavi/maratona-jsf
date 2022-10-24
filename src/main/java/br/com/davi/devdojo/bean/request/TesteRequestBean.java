package br.com.davi.devdojo.bean.request;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable {
    private List<String> bairros;
    private List<String> bairroSelecionado = new ArrayList<>();

    @PostConstruct
    public void init(){
        System.out.println("Entrou no PostConstruct do RequestScoped");
        bairros = asList("Asa Norte", "Noroeste", "Asa Sul", "Cruzeiro");
    }

    public void escolherBairro(){
        int index = ThreadLocalRandom.current().nextInt(4);
        String bairro = bairros.get(index);
        bairroSelecionado.add(bairro);
    }

    public List<String> getBairros() {
        return bairros;
    }

    public void setBairros(List<String> bairros) {
        this.bairros = bairros;
    }

    public List<String> getBairroSelecionado() {
        return bairroSelecionado;
    }

    public void setBairroSelecionado(List<String> bairroSelecionado) {
        this.bairroSelecionado = bairroSelecionado;
    }
}

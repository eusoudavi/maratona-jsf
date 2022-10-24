package br.com.davi.devdojo.bean.session;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class TesteSessionBean implements Serializable {
    private List<String> bairros;
    private List<String> bairroSelecionado = new ArrayList<>();
    @PostConstruct
    public void init(){
        System.out.println("Entrou no PostConstruct do SessionScoped");
        bairros = asList("Asa Norte", "Noroeste", "Asa Sul", "Cruzeiro");
    }
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect-true";
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

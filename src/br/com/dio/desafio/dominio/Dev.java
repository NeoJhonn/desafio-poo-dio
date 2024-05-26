package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritosSet;
    private Set<Conteudo> conteudosConcluidosSet;

    public Dev(String nome) {
        this.nome = nome;
        // Usei LinkedHashSet, pois que que os cursos sejam
        // inseridos em ordem e também para pode se increver
        // somente em cursos únicos ou seja apenas uma vez
        this.conteudosInscritosSet = new LinkedHashSet<>();
        this.conteudosConcluidosSet = new LinkedHashSet<>();
    }

    public void InscreverBootcamp(Bootcamp bootcamp) {

    }

    public void progredir() {

    }

    public void calcularTotalXP() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritosSet() {
        return conteudosInscritosSet;
    }

    public void setConteudosInscritosSet(Set<Conteudo> conteudosInscritosSet) {
        this.conteudosInscritosSet = conteudosInscritosSet;
    }

    public Set<Conteudo> getConteudosConcluidosSet() {
        return conteudosConcluidosSet;
    }

    public void setConteudosConcluidosSet(Set<Conteudo> conteudosConcluidosSet) {
        this.conteudosConcluidosSet = conteudosConcluidosSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritosSet, dev.conteudosInscritosSet) && Objects.equals(conteudosConcluidosSet, dev.conteudosConcluidosSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritosSet, conteudosConcluidosSet);
    }
}

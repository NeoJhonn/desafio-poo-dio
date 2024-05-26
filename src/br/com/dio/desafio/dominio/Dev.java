package br.com.dio.desafio.dominio;

import java.util.*;

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
        this.conteudosInscritosSet.addAll(bootcamp.getConteudosSetSet());

        // Matricular o Dev no Bootcamp
        bootcamp.getDevsInscritosSet().add(this);
    }

    public void progredir() {
        // Usando Optional para prevenir erros de NullPointerException
        // pegando o primeiro conteudo de conteudosInscritosSet
        Optional<Conteudo> conteudo = this.conteudosInscritosSet.stream().findFirst();

        // E colocando na no set de conteudosConcluidosSet
        if (conteudo.isPresent()) {
            this.conteudosConcluidosSet.add(conteudo.get());
            // E remover do set de conteudosInscritosSet
            this.conteudosInscritosSet.remove(conteudo.get());
        } else {
            System.err.println("Você não esta matriculado em nenhum curso!");;
        }
    }

    public double calcularTotalXP() {
        // percorrer todos os conteúdos, calcular o XP e somar todos
        return this.conteudosConcluidosSet.stream().mapToDouble(Conteudo::calcularXP).sum();
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

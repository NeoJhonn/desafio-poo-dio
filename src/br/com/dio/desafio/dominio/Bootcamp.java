package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicio;
    private final LocalDate dataFim;
    private Set<Dev> devsInscritosSet;
    private Set<Conteudo> conteudosSetSet;

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = LocalDate.now();
        this.dataFim = dataInicio.plusDays(45);// 45 dias
        this.devsInscritosSet = new HashSet<>();
        this.conteudosSetSet = new LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Dev> getDevsInscritosSet() {
        return devsInscritosSet;
    }

    public void setDevsInscritosSet(Set<Dev> devsInscritosSet) {
        this.devsInscritosSet = devsInscritosSet;
    }

    public Set<Conteudo> getConteudosSetSet() {
        return conteudosSetSet;
    }

    public void setConteudosSetSet(Set<Conteudo> conteudosSetSet) {
        this.conteudosSetSet = conteudosSetSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFim, bootcamp.dataFim) && Objects.equals(devsInscritosSet, bootcamp.devsInscritosSet) && Objects.equals(conteudosSetSet, bootcamp.conteudosSetSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFim, devsInscritosSet, conteudosSetSet);
    }
}

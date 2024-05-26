package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static double XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public Conteudo() {
    }

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Aqui se colocar somente a assinatura do método, pois se trata de método
    // abstrato que deve ser implementado nas classes filhas
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  "titulo= '" + titulo + '\'' +
                ", descricao= '" + descricao;
    }
}

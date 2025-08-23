package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Estado implements Serializable {
    private static final long serialVersionUTTD = 5L;
    private String nome;
    private String sigla;
    private ArrayList<Cidade> cidades = new ArrayList<>();

    public Estado(){}

    public Estado(String nome, String sigla, ArrayList<Cidade> cidades) {
        this.nome = nome;
        this.sigla = sigla;
        this.cidades = cidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Cidade> getCidades() {
        return this.cidades;
    }

    public void setCidade(Cidade cidade){
        this.cidades.add(cidade);
    }

    public void setCidades(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", cidades=" + cidades +
                '}';
    }

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
}

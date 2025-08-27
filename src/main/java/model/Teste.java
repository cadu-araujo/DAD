package model;

import java.io.Serializable;

public class Teste implements Serializable {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Teste() {
    }

    public Teste(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Teste{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

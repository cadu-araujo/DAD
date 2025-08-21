package model;

import java.io.Serializable;

public class Cidade implements Serializable {
    private String Nome;
    private String Estado;

    public Cidade() {
    }

    public Cidade(String nome, String estado) {
        Nome = nome;
        Estado = estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "Nome='" + Nome + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }
}

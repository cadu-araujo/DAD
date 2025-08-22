package model;

import java.io.Serializable;

public class Cidade implements Serializable {
    private String Nome;
    private Estado estado;

    public Cidade() {
    }

    public void setEstado(model.Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public Cidade(String nome, model.Estado estado1) {
        Nome = nome;
        this.estado = estado1;
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
                ", estado=" + estado +
                '}';
    }
}

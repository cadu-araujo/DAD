package model;

import java.io.Serializable;

public class Cidade implements Serializable {
    private String nome;
    private Estado estado;

    public Cidade() {
    }

    public void setEstado(model.Estado estado) {
        this.estado = estado;
        estado.setCidade(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
        this.estado.setCidade(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", estado=" + estado.getNome() +
                '}';
    }
}

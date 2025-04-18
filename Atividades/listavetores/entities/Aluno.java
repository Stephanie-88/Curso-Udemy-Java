package Atividades.listavetores.entities;

import java.util.*;

public class Aluno {
    private String nome;
    private double n1;
    private double n2;

    public Aluno(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public boolean Media() {
        if((this.n1 + this.n2)/2 >= 6) return true;
        else return false;
    }

    public String getNome() {
        return this.nome;
    }
}

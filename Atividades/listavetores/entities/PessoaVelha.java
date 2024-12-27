package Atividades.listavetores.entities;

public class PessoaVelha {
    private int idade;
    private String nome;

    public PessoaVelha(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getINome() {
        return nome;
    }


}

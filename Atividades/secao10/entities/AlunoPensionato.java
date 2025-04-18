package Atividades.secao10.entities;

public class AlunoPensionato {
     private String nome, email;

    public AlunoPensionato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() { return nome;}
    public String getEmail() {return email;}

    @Override
    public String toString() {
        return nome + ", " + email;
    }
}

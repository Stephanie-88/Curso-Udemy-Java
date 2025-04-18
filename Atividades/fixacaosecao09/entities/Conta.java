package Atividades.fixacaosecao09.entities;

public class Conta {
    private int numConta;
    private String nome;
    private double depositoInicial;

    public Conta(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
    }

    public Conta(int numConta, String nome, double depositoInicial){
        this.numConta = numConta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public Conta(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return depositoInicial;
    }

    public int getNumConta() {
        return numConta;
    }

    public void saque(double valor){
        depositoInicial -= valor + 5.0;
    }

    public void deposito(double valor){
        depositoInicial += valor;
    }

    public String toString(){
        return "Conta: " + numConta + ", Cliente: " + nome + ", Saldo: $ " + String.format("%.2f", depositoInicial);
    }

}

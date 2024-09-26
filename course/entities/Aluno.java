package entities;

public class Aluno {
    public double nota1, nota2, nota3;
    public String nome;

    public double media() {
        return nota1 + nota2 + nota3;
    }

    public void verificaAprovacao(double media) {

        if(media >= 60) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", 60-media);
        }
    }
}

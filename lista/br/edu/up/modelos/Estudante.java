package lista.br.edu.up.modelos;

public class Estudante {
    private double n1;
    private double n2;
    private double n3;
    private double mediaP;
    private String nome;
    private String matricula;
    private char classif;

    public Estudante(String nome, String matricula, double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.nome = nome;
        this.matricula = matricula;
    }


    public void calcularNota() {
        this.mediaP = ((this.n1 * 2) + (this.n2 * 3) + (this.n3 * 5)) / 10; 
    }

    public void definirClassificacao() {
        if (this.mediaP >= 8 && this.mediaP < 10) {
            this.classif = 'A';
        } else if (this.mediaP < 8 && this.mediaP >= 7) {
            this.classif = 'B';
        } else  if (this.mediaP >= 6 && this.mediaP < 7) {
            this.classif = 'C';
        } else if (this.mediaP < 6  && this.mediaP >= 5) {
            this.classif = 'D';
        } else if (this.mediaP >= 0 && this.mediaP < 5) {
            this.classif = 'R';
        }
    }


    public double getN1() {
        return n1;
    }


    public void setN1(double n1) {
        this.n1 = n1;
    }


    public double getN2() {
        return n2;
    }


    public void setN2(double n2) {
        this.n2 = n2;
    }


    public double getN3() {
        return n3;
    }


    public void setN3(double n3) {
        this.n3 = n3;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public double getNotaFinal() {
        return mediaP;
    }


    public char getClassif() {
        return classif;
    }   
}
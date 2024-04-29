package lista.br.edu.up.modelos;

public class Reajuste {
    private String nome;
    private double salarioVelho;
    private double salarioMinimo;
    private double reajuste;
    private double salarioNovo;
    
    public Reajuste(String nome, double salarioVelho, double salarioMinimo, double reajuste) {
        this.nome = nome;
        this.salarioVelho = salarioVelho;
        this.salarioMinimo = salarioMinimo;
        this.reajuste = reajuste;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioVelho() {
        return salarioVelho;
    }

    public void setSalarioVelho(double salarioVelho) {
        this.salarioVelho = salarioVelho;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getReajuste() {
        return reajuste;
    }

    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }

    public double getSalarioNovo() {
        return salarioNovo;
    }
    
   public void calcularSalarioNovo() {
        this.salarioNovo = this.salarioVelho + (this.salarioVelho * (this.reajuste / 100));    
   }
}
package lista.br.edu.up.modelos;

public class Consumo {
    private int estabelecimento;
    private double consumo;
    private double precoFinal;
    
    public Consumo(){

    }
    public Consumo(int estabelecimento, double consumo) {
        this.estabelecimento = estabelecimento;
        this.consumo = consumo;
    }

    public int getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(int estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void calcularPrecoFinal(double gasto) {
        this.precoFinal =  this.consumo * gasto;
    }
}
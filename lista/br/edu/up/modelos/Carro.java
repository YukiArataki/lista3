package lista.br.edu.up.modelos;

public class Carro {
    private double consumoMedio;
    private double distPercorrida;
    private double combustivelGasto;

    public Carro(){

    }
    
    public Carro(double distPercorrida, double combustivelGasto) {
        this.distPercorrida = distPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public double getDistPercorrida() {
        return distPercorrida;
    }

    public void setDistPercorrida(double distPercorrida) {
        this.distPercorrida = distPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public void setConsumoMedio(double distPercorrida, double combustivelGasto){
        this.consumoMedio = distPercorrida/combustivelGasto;
    }
    
}

package lista.br.edu.up.modelos;

public class CarangoNovo {
    private double valorTotal;
    private double valorTotalComDesconto;
    private double valorDesconto;
    private int comb;
    
    public CarangoNovo(double valorTotal, int comb) {
        this.valorTotal = valorTotal;
        this.comb = comb;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public int getComb() {
        return comb;
    }

    public void setComb(int comb) {
        this.comb = comb;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorTotalComDesconto() {
        return valorTotalComDesconto;
    }

    public void calcularValores() {
        if (this.comb == 1) {
            this.valorDesconto = this.valorTotal * 0.25;
            this.valorTotalComDesconto = this.valorTotal - this.valorDesconto;
        } else if (this.comb == 2) {
            this.valorDesconto = this.valorTotal * 0.21;
            this.valorTotalComDesconto = this.valorTotal - this.valorDesconto;
        } else if (this.comb == 3) {
            this.valorDesconto = this.valorTotal * 0.14;
            this.valorTotalComDesconto = this.valorTotal - this.valorDesconto;
        }
    }    
}

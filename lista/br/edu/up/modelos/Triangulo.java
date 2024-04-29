package lista.br.edu.up.modelos;

public class Triangulo {
    private double l1;
    private double l2;
    private double l3;
    private String tipo;

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public void definirTipo() {
        if (((this.l1 == this.l2) && this.l3 != l1) || ((this.l1 == this.l3) && this.l2 != l1) 
        || ((this.l2 == this.l3) && this.l1 != l2)) {
            this.tipo = "Isóceles";
        } else if (l1 == l2 && l2 == l3) {
            this.tipo = "Equilatero";
        } else if (l1 != l2 && l2 != l3) {
            this.tipo = "Escaleno";
        }
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public String getTipo() {
        return tipo;
    }   
}
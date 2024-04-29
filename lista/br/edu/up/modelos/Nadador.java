package lista.br.edu.up.modelos;

public class Nadador {
    private int idade;
    private String categoria;

    public Nadador(int idade) {
        this.idade = idade;

    }

    public void definirCategoria() {
        if (this.idade >= 5 && this.idade <= 7) {
            this.categoria = "Infantil A";
        } else if (this.idade >= 8 && this.idade <= 10) {
            this.categoria = "Infantil B";
        } else if (this.idade >= 11 && this.idade <= 13) {
            this.categoria = "Juvenil A";
        } else if (this.idade >= 14 && this.idade <= 17) {
            this.categoria = "Juvenil B";
        } else if (this.idade >= 18 && this.idade <= 25) {
            this.categoria = "Sênior";
        } else {
            this.categoria = "idade fora da faixa etária";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }    
}

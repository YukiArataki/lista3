package lista.br.edu.up.modelos;

public class PesoIdeal {
    private String nome;
    private int idade;
    private double altura;
    private char sexo;
    private double pesoIdeal;

    public PesoIdeal(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void calcularPesoIdeal() {
        if (this.sexo == 'M') {
            if (this.altura > 1.70 && this.idade <= 20) {
                this.pesoIdeal = (72.7 * this.altura) - 58;
            } else if (this.altura > 1.70 && this.idade >= 21 && this.idade <= 39) {
                this.pesoIdeal = (72.7 * this.altura) - 53;
            } else  if (this.altura > 1.70 && this.idade >= 40) {
                this.pesoIdeal = (72.7 * this.altura) - 45;
            } else if (this.altura <= 1.70 && this.idade <= 40) {
                this.pesoIdeal = (72.7 * this.altura) - 50;
            } else if (this.altura <= 1.70 && this.idade > 40) {
                this.pesoIdeal = (72.7 * this.altura) - 58;
            }
        } else if (this.sexo == 'F') {
            if (this.altura >1.50) {
                this.pesoIdeal = (62.1 * this.altura) - 44.7;
            } else if (this.altura < 1.50) {
                if (this.idade >= 35) {
                    this.pesoIdeal = (62.1 * this.altura) - 45;
                } else if (this.idade < 35) {
                    this.pesoIdeal = (62.1 * this.altura) - 49;
                }
            }
        }
    }

    public double getPesoIdeal() {
        return pesoIdeal;
    }
}
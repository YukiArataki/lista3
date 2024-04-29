package lista.br.edu.up.modelos;

public class Abono {
    private String nome;
    private double salarioFixo;
    private char sexo;
    private double abono;
    private int idade;
    private double salarioLiquido;

    public void setSalarioFixo(double salarioFixo){
        this.salarioFixo = salarioFixo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;

        if(this.sexo == 'M' || this.sexo == 'm' ){
            if(this.idade >= 30){
                this.abono = 100;
            }else{
                this.abono = 50;
            }
        }else{
            if(this.idade >= 30){
                this.abono = 200;
            }
            else{
                this.abono = 80;
            }
        }
    }
    public double setSalarioLiquido(double abono){
        return this.salarioLiquido = this.salarioFixo + abono;
    }
    public void setAbono(double abono) {
        this.abono = abono;
    }
    public String getNome() {
        return nome;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }
    public char getSexo() {
        return sexo;
    }
    public double getAbono() {
        return abono;
    }
    public int getIdade() {
        return idade;
    }
    public double getSalarioLiquido() {
        return salarioLiquido;
    }
}
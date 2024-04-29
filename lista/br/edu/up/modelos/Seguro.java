package lista.br.edu.up.modelos;

public class Seguro {
    private char grupoRisco;
    private String nome;
    private int idade;
    private int categoria;

    
    public char getGrupoRisco() {
        return grupoRisco;
    }
    public void setGrupoRisco(char grupoRisco) {
        this.grupoRisco = grupoRisco;
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
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
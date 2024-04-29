package lista.br.edu.up.controles;
import lista.br.edu.modelos.Aluno;

public class Exercio1 {
    public static void executar() {
        /*1. */

        double nota1 = prompt.lerDecimal();
        double nota2 = prompt.lerDecimal();
        double nota3 = prompt.lerDecimal();
        String nome = prompt.lerlinha();

        Aluno aluno1 = new Aluno(nome, nota1, nota2, nota3);
        aluno1.calcularmedia();

        System.out.println("Nome: %s", aluno1.getNome);
        System.out.println("Média: %.1f", aluno1.getMedia());
    }

}

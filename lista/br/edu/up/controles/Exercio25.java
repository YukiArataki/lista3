package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.Estudante;
import lista.br.edu.up.util.Prompt;

public class Exercicio25 {
    public static void executar() {
        /*25. Dado o nome de um estudante, 
        com o respectivo número de matrícula
        e as três notas acima mencionadas,
        desenvolva um programa para calcular
        a nota final e a classificação de cada
        estudante. A classificação é dada conforme 
        a lista abaixo:
        
        Nota Final      Classificação
        [8,10]              A
        [7,8]               B
        [6,7]               C
        [5,6]               D
        [0,5]               R
        
        Imprima o nome do estudante, com o seu número, nota final e classificação
        */

        double n1 = Prompt.lerDecimal("Nota laboratório: ");
        double n2 = Prompt.lerDecimal("Nota avaliação semestral: ");
        double n3 = Prompt.lerDecimal("Nota exame final: ");
        String nome = Prompt.lerLinha("Nome: ");
        String matricula = Prompt.lerLinha("Matricula: ");

        Estudante aluno1 = new Estudante(nome, matricula, n1, n2, n3);
        aluno1.calcularNota();
        aluno1.definirClassificacao();


        System.out.printf("Nome: %s\n", aluno1.getNome());
        System.out.printf("Matricula: %s\n", aluno1.getMatricula());
        System.out.printf("Nota final: %.1f\n", aluno1.getNotaFinal());
        System.out.printf("Classificação: %c", aluno1.getClassif());

    }
}
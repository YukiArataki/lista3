package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.PesoIdeal;
import lista.br.edu.up.util.Prompt;

public class Exercicio23 {
    public static void executar() {
        /*23. Faça um programa que leia o nome, o sexo, 
        a altura e a idade de uma pessoa. 
        Calcule e mostre nome e o seu peso ideal de acordo 
        com as seguintes características da pessoa:
        
        Sexo    Altura      Idade       Peso Ideal

        M>      1.70        <= 20       (72.7*h) - 58
                            21 a 39     (72.7*h) - 53
                            >= 40       (72.7*h) - 45
                
                <= 1.70     <= 40       (72.7*h) - 50
                            > 40        (72.7*h) - 58
        

        F>      1.50         ---        (62.1*h) - 44.7

                <= 1.50     >= 35       (62.1*h) - 45
                            < 35        (62.1*h) - 49
    */
    String nome =Prompt.lerLinha("Nome: ");
    char sexo = Prompt.lerCaractere("Sexo [M / F]: ");
    double altura = Prompt.lerDecimal("Altura (m): ");
    int idade = Prompt.lerInteiro("Idade: ");

    PesoIdeal pessoa1 = new PesoIdeal(nome, sexo, altura, idade);
    pessoa1.calcularPesoIdeal();

    System.out.printf("Nome: %s\n", pessoa1.getNome());
    System.out.printf("Peso ideal: %.1f", pessoa1.getPesoIdeal());
    }
}
package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.Nadador;
import lista.br.edu.up.util.Prompt;

public class Exercicio21 {
    public static void executar() {
        /*21. Elabore um programa que, 
        dada a idade de um nadador. 
        Classifique-o em uma das 
        seguintes categorias:

        Infantil A = 5 - 7 anos
        Infantil B = 8 - 10 anos
        juvenil A = 11- 13 anos
        juvenil B = 14 - 17 anos
        Sênior = 18 - 25 anos
        
        Apresentar mensagem 
        “idade fora da faixa etária” 
        quando for outro ano não 
        contemplado
        */

        //resposta:
        int idade = Prompt.lerInteiro("Idade do nadador: ");

       Nadador pessoa1 = new Nadador(idade);
        pessoa1.definirCategoria();

       System.out.printf("Classificação: %s", pessoa1.getCategoria());
    }
}
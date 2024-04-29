package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.Reajuste;
import lista.br.edu.up.util.Prompt;

 /*17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salárior e 
ajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai 
aumentar sua folha de pagamento.*/

public class Exercicio17 {
    public static void executar() {

        String nome = Prompt.lerLinha("Nome: ");
        double salario = Prompt.lerDecimal("Salario R$: "); 
        double salarioMinimo = Prompt.lerDecimal("Salario mínimo atual R$: "); 
        double reajuste = Prompt.lerDecimal("Reajuste %: "); 
         
        Reajuste func1 = new Reajuste(nome, salario, salarioMinimo, reajuste);
        func1.calcularSalarioNovo();
        
        System.out.printf("Salario novo: R$ %.2f", func1.getSalarioNovo());

    }
}


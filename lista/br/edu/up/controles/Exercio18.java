package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.Abono;
import lista.br.edu.up.util.Prompt;

 /*18. Faça um programa que receba o nome a idade, 
o sexo e salário fixo de um funcionário. Mostre
o nome e o salário líquido acrescido do abono 
conforme o sexo e a idade:

    Sexo    Idade   Abono
    M   >= 30   100,00
        < 30    50,00

    F   >= 30   200,00
        < 30    80,00*/

public class Exercicio18 {
    public static void executar() {
       
        Abono funcionario1 = new Abono();

        funcionario1.setNome(Prompt.lerLinha("Nome:"));
        funcionario1.setIdade(Prompt.lerInteiro("Idade:"));
        funcionario1.setSexo(Prompt.lerCaractere("Sexo:"));
        funcionario1.setSalarioFixo(Prompt.lerDecimal("Salário fixo:"));
        funcionario1.setSalarioLiquido(funcionario1.getAbono());
        Prompt.separador();
        Prompt.imprimir("Nome: " + funcionario1.getNome() + "\nSalário liquido: R$" + funcionario1.getSalarioLiquido());
        Prompt.separador();
    }
}
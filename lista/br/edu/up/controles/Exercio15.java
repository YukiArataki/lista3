package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.CarangoNovo;
import lista.br.edu.up.util.Prompt;

/*15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
Façaum programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
O descontodeverá ser calculado sobre o valor do veículo de acordo com o combustível 
(álcool – 25%, gasolina– 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. 
Informe total dedesconto e total pago pelos clientes.*/

public class Exercicio15 {
    public static void executar() {
        int cont = 0;
        double valorTotal = 1;
        CarangoNovo cliente1[] = new CarangoNovo[100];
        double somaDescontos = 0;
        double somaPago = 0;
        
        while (valorTotal != 0) {
            valorTotal = Prompt.lerDecimal("Valor do veiculo R$: ");
            if (valorTotal == 0) {
                break;
            }
            int comb = Prompt.lerInteiro("Tipo combustivel [1 - alcool, 2 - gasolina, 3 - diesel]:");
            cliente1[cont] = new CarangoNovo(valorTotal, comb);
            cliente1[cont].calcularValores();
            
            
            System.out.printf("Valor desconto: R$ %.2f\n", cliente1[cont].getValorDesconto());
            System.out.printf("Valor total com desconto: R$ %.2f\n", cliente1[cont].getValorTotalComDesconto());
            System.out.printf("Valor total: R$ %.2f\n", cliente1[cont].getValorTotal());
            System.out.printf("----------------\n-");

            somaDescontos += cliente1[cont].getValorDesconto();
            somaPago += cliente1[cont].getValorTotalComDesconto();

            cont ++;
        }

        System.out.printf("\n----------------\n" );
        System.out.printf("VALOR total pago: R$ %.2f\n", somaPago);
        System.out.printf("VALOR total descontos: R$ %.2f\n", somaDescontos);
       
    }
}
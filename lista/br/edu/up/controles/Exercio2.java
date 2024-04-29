package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.Carro;

public class Exercicio02 {
    public static void executar() {
        /*2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a
        distância total percorrida pelo automóvel e o total de combustívelgasto.*/

        Carro carro1 = new Carro();

        carro1.setDistPercorrida(Prompt.lerDecimal("Distancia que esse carro percorreu: "));
        carro1.setCombustivelGasto(Prompt.lerDecimal("Combustivel gasto pelo carro: "));
        carro1.setConsumoMedio(carro1.getDistPercorrida(), carro1.getCombustivelGasto());
        
        String CM = String.format("%.2f", carro1.getConsumoMedio()).replace(".", ",");
        Prompt.imprimir(CM + " Km/l");
        
    }   

}

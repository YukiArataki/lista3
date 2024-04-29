package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.Consumo;
import lista.br.edu.up.util.Prompt;

public class Exercicio22 {
    public static void executar() {
        /*22. Faça um programa que calcule o 
        valor da conta de luz de uma pessoa. 
        Sabe-se que o cálculo da conta de luz 
        segue a tabela abaixo:
        Tipo de Cliente Valor do KW/h 

        (Residência) 0,60
        (Comércio) 0,48
        (Indústria) 1,29
        */
        Consumo cliente = new Consumo();
        double gasto;
        boolean flag;
        Prompt.separador();
        do{
            flag = false;
            cliente.setEstabelecimento(Prompt.lerInteiro("Tipo de estabelecimento: (1 - Residência, 2 - Comércio, 3 - Indústria)"));
            switch (cliente.getEstabelecimento()) {
                case 1:
                    flag = true;  
                    break;
                case 2:
                    flag = true;
                    break;
                case 3:
                    flag = true;
                    break;    
                default:
                    Prompt.imprimir("Valor inválido\ndigite novamente");
                    break;
            }
        }while(flag == false);
        
            cliente.setConsumo(Prompt.lerDecimal("Consumo do mês da residência em KW/h:"));
            Prompt.separador();

        if(cliente.getEstabelecimento() == 1){
            gasto = 0.6;
        }else if(cliente.getEstabelecimento() == 2){
            gasto = 0.48;
        }else{
            gasto = 1.29;
        }
        cliente.calcularPrecoFinal(gasto);
        Prompt.imprimir("Custo final do mês:\nR$" + cliente.getPrecoFinal());
        Prompt.separador();
        
    }
}


package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.PrecoDeCusto;
import lista.br.edu.up.util.Prompt;

 /*14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. 
Mostrecomo resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de custo e 
do preço de venda*/

public class Exercicio14 {
    public static void executar() {
       
        PrecoDeCusto produto[] = new PrecoDeCusto[40];
        Prompt.separador();
        double somaVenda = 0, somaCusto = 0, mediaVendas, mediaCusto;
        boolean gerarAleatorio = false;
        String texto,texto2;

        String escolha = Prompt.lerLinha("Deseja Implementar aleatóriamente: ");
        
        if(escolha.charAt(0) == 's' || escolha.charAt(0) == 'S'){
            gerarAleatorio = true;
        }
        Prompt.separador();
        for (int i = 0; i < produto.length; i++) {
            produto[i] = new PrecoDeCusto();

            Prompt.imprimir("\n=> Produto "+ (i+1));

        if(gerarAleatorio == true){
            double k = Prompt.decimalAleatorio(0, 10000);
            texto = String.format("%.2f",k).replace(",", ".");
            double j = Prompt.decimalAleatorio(0, 10000);
            texto2 = String.format("%.2f",j).replace(",", ".");
            
            produto[i].setPrecoCusto(k);
            Prompt.imprimir("Preço de custo: R$" + texto);

            produto[i].setPrecoVenda(j);
            Prompt.imprimir("Preço de venda: R$" + texto2);

        }else{
            produto[i].setPrecoCusto(Prompt.lerDecimal("Preço de custo: "));

            produto[i].setPrecoVenda(Prompt.lerDecimal("Preço de venda: "));
        }
            
        if(produto[i].getPrecoCusto() > produto[i].getPrecoVenda()){

            texto = String.format("%.2f",(produto[i].getPrecoCusto() - produto[i].getPrecoVenda())).replace(",", ".");

            Prompt.imprimir("Houve prejuiso de: R$" + texto);

        }else if(produto[i].getPrecoCusto() == produto[i].getPrecoVenda()){
            Prompt.imprimir("Preço de custo e de venda iguais");
        }else{
            texto = String.format("%.2f",(produto[i].getPrecoVenda() - produto[i].getPrecoCusto())).replace(",", ".");
            Prompt.imprimir("Houve lucro de: R$" + texto); 
        }
        
            somaCusto += produto[i].getPrecoCusto();
            somaVenda += produto[i].getPrecoVenda();
    }   

    mediaCusto = somaCusto/40;
    mediaVendas = somaVenda/40;

    
    texto = String.format("%.2f",mediaCusto).replace(",", ".");
    texto2 = String.format("%.2f",mediaVendas).replace(",", ".");

    Prompt.separador();
    Prompt.imprimir("Média de Custo: R$"+texto+"\nMédia de Vendas: R$"+texto2);
    Prompt.separador();
    }
}
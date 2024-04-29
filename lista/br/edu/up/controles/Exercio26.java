package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.Seguro;
import lista.br.edu.up.util.Prompt;

public class Exercicio26 {
    public static void executar() {
        /*
         26. Uma seguradora possui nove categorias 
         de seguro baseadas na idade e ocupação do 
         segurado.Somente pessoas com pelo menos 17 anos 
         e não mais que 70 anos podem adquirir apólices de seguro. 
         Quanto às classes de ocupações, foram definidos três grupos de risco: 
         baixo, médio e alto.
         
         A tabela abaixo fornece as categorias em função da faixa etária 
         e do grupo de risco. Dados nome,idade e grupo de risco de um pretendente, 
         determinar e imprimir seus dados e categoria. Caso aidade não esteja na 
         faixa necessária, imprimir uma mensagem informando que ele não se enquadra
         em nenhuma das categorias ofertadas.

                    Grupo de Risco
            Idade    Baixo   Médio   Alto
           17 a 20     1       2       3
           21 a 24     2       3       4
           25 a 34     3       4       5
           35 a 64     4       5       6
           65 a 70     7       8       9
        */
        Seguro novoSeguro = new Seguro();
        boolean valido;

        novoSeguro.setNome(Prompt.lerLinha("Nome: "));
        novoSeguro.setIdade(Prompt.lerInteiro("Idade:"));

        if(novoSeguro.getIdade() < 17 || novoSeguro.getIdade() > 70){
            Prompt.imprimir("não se enquadraem nenhuma das categorias ofertadas");
        }
        else{
            do{
                valido = false;

                novoSeguro.setGrupoRisco(Prompt.lerCaractere("Grupo de risco(Baixo - B / Médio - M / Alto - A):"));

                switch (novoSeguro.getGrupoRisco()) {
                    case 'B':
                        valido = true;
                        break;
                    case 'M':
                        valido = true;
                        break;
                    case 'A':
                        valido = true;
                        break;
                    default:
                        Prompt.imprimir("Letrainválida\nDigite novamente");
                        break;
                }
            }while(valido == false);

            int idade = novoSeguro.getIdade(), c = 0;

            switch (novoSeguro.getGrupoRisco()) {
                case 'B':
                        if(idade >= 17 && idade <= 20){
                            c = 1;
                        }
                        else if(idade >= 21 && idade <= 24){
                            c = 2;
                        }
                        else if(idade >= 25 && idade <= 34){
                            c = 3;
                        }
                        else if(idade >= 35 && idade <= 64){
                            c = 4;
                        }
                        else{
                            c = 7;
                        }
                    break;
                case 'M':
                        if(idade >= 17 && idade <= 20){
                            c = 2;
                        }
                        else if(idade >= 21 && idade <= 24){
                            c = 3;
                        }
                        else if(idade >= 25 && idade <= 34){
                            c = 4;
                        }
                        else if(idade >= 35 && idade <= 64){
                            c = 5;
                        }
                        else{
                            c = 8;
                        }
                    break;
                case 'A':
                        if(idade >= 17 && idade <= 20){
                            c = 3;
                        }
                        else if(idade >= 21 && idade <= 24){
                            c = 4;
                        }
                        else if(idade >= 25 && idade <= 34){
                            c = 5;
                        }
                        else if(idade >= 35 && idade <= 64){
                            c = 6;
                        }
                        else{
                            c = 9;
                        }
                    break;
                    
                }
                novoSeguro.setCategoria(c);
                Prompt.separador();
                Prompt.imprimir("Nome: " + novoSeguro.getNome() +"\nGrupo de Risco: " + novoSeguro.getGrupoRisco() +"\nCategoria: " + novoSeguro.getCategoria());
                Prompt.separador();
            }
        }
}
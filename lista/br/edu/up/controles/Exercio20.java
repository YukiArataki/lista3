package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.HoraAula;
import lista.br.edu.up.util.Prompt;

public class Exercicio20 {
    public static void executar() {
        /*20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:

        Professor Nível 1 R$12,00 por hora/aula
        Professor Nível 2 R$17,00 por hora/aula
        Professor Nível 3 R$25,00 por hora/aula
        */

        int nivel;
        boolean valido;
        
        Prompt.separador();
        do{ 
            valido = false;
            nivel = Prompt.lerInteiro("Nivel do Professor: (1,2 ou 3):");

            if(nivel <= 1 && nivel >= 3){
                Prompt.imprimir("Nível inválido\nDigite novamente\n");
            }else{
                valido = true;
            }
        }while(valido == false);
        HoraAula professor = new HoraAula();

        professor.setNivel(nivel);
        professor.setValorHA();
        
        String txt = String.format("%.2f", professor.getValorHA()).replace(",", ".");

        Prompt.imprimir("Professor Nível "+professor.getNivel() +" R$"+txt+" por hora/aula");
        Prompt.separador();
    }
}
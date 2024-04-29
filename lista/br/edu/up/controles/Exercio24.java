package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.Aluno;
import lista.br.edu.up.util.Prompt;

public class Exercicio24 {
    public static void executar() {
        /*24. Em um curso de Ciência da Computação 
        a nota do estudante é calculada a partir de 
        três notas atribuídas, respectivamente, a 
        um trabalho de laboratório, a uma avaliação 
        semestral e a um examefinal. As notas variam, 
        de 0 a 10 e a nota final é a média ponderada 
        das três notas mencionadas.A lista abaixo 
        fornece os pesos:
        
        a. Laboratório: peso 2
        b. Avaliação semestral: peso 3
        c. Exame final: peso 5
        
        */

        Aluno aluno = new Aluno(3);
        int flag;
        double[] notas = new double[3];
        int[] pesos = new int[3];

        for(int i = 0; i < aluno.getnProvas(); i++){

            do{

            notas[i] = Prompt.lerDecimal("Nota["+(i + 1)+"]:");
            
            flag = 0;

            if(notas[i] <= 10 && notas[i] >= 0){

            }else{
                System.out.println("nota inválida");
                flag++;
            }
            }while(flag == 1);

            aluno.setNotas(notas);

            pesos[0] = 2;
            pesos[1] = 3;
            pesos[2] = 5;

            aluno.setPesos(pesos);

            aluno.calularNotaFinal();
            
        }
        Prompt.separador();
        Prompt.imprimir("Nota final: "+aluno.getNotaFinal());
        Prompt.separador();
    }
}
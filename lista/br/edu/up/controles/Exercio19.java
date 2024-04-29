package lista.br.edu.up.controles;

import lista.br.edu.up.modelos.Triangulo;
import lista.br.edu.up.util.Prompt;
import lista.br.edu.up.util.VerificarTriangulo;

 /*19. Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
 Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
        
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
Triângulo Equilátero: aquele que tem os comprimentos dos trêslados iguais;
        
Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todotriângulo equilátero é 
também isóscele;

Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.*/

public class Exercicio19 {
       
        public static void executar() {
            double l1 = Prompt.lerDecimal("Lado 1: ");
            double l2 = Prompt.lerDecimal("Lado 1: ");
            double l3 = Prompt.lerDecimal("Lado 1: ");
           
            boolean conf = VerificarTriangulo.lados(l1, l2, l3);
            
            if (conf = true) {
                Triangulo tri1 = new Triangulo(l1, l2, l3);
                tri1.definirTipo();
                System.out.printf("Tipo do triângulo: %s", tri1.getTipo());
            } else {
                System.out.printf("Não é possível formar triângulo");
            }
        }
}
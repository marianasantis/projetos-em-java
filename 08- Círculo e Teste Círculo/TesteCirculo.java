/* Crie uma classe círculo que tenha como atributo: raio e como métodos: alterar raio (não pode ser menor que zero), 
ler raio e exibir dados. Crie classe teste para exibir dados do objeto. */

import java.util.Scanner;

public class TesteCirculo
{
   public static void main (String args[])
   {
      Scanner leitor = new Scanner(System.in);
      Circulo c1 = new Circulo();
      
      System.out.println("Digite o valor do raio");
      double raio = leitor.nextDouble(); 
      c1.setRaio(raio);
      
      c1.exibirDados();
   }
}
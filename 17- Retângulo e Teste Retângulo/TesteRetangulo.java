/* Crie uma classe retângulo que tenha como atributos: base e altura e como 
métodos: consultar e alterar base e altura (não pode ser menor que zero), 
consultar área e perímetro, informar se é um não ou quadrado (true/false) e 
exibir dados. Crie classe teste. */

import java.util.Scanner;

public class TesteRetangulo
{
   public static void main(String args[])
   {
      Scanner leitor = new Scanner(System.in);
      Retangulo ret = new Retangulo();
      
      System.out.println("Digite o valor da base");
      double base = leitor.nextDouble();
      ret.setBase(base);
      
      System.out.println("Digite o valor da altura");
      double altura = leitor.nextDouble();
      ret.setAltura(altura);
      
      ret.exibirDados();
   }
}
/* Elaborar classe circunferência capaz de retornar o valor da área, perímetro e diâmetro.
Crie classe teste para testar a classe criada */

import java.util.Scanner;

public class TesteCircunferencia
{
   public static void main(String args[])
   {
      Scanner leitor = new Scanner(System.in);
      Circunferencia circu = new Circunferencia();
      
      System.out.println("Digite o valor do raio");
      double raio = leitor.nextDouble();
      circu.setRaio(raio);
      
      System.out.println("O valor da área é " + circu.getArea());
      System.out.println("O valor do perímetro é " + circu.getPerimetro());
      System.out.print("O valor do diâmetro é " + circu.getDiametro());
   }
}
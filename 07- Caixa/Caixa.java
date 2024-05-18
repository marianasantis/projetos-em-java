import java.util.Scanner;

public class Caixa
{
   public static void main (String args[])
   {
      Scanner leitor = new Scanner (System.in);
      double valor, total = 0;
      
      System.out.println("Insira os valores das compras. Para finalizar a entrada dos dados insira 0");
      valor = leitor.nextDouble();
      
      while (valor != 0)
      {
         total = total + valor;
         valor = leitor.nextDouble();
      }
      
      if (total < 50)
      {
         total = total * 0.95;
      }
      else if (total <= 100)
      {
         total = total * 0.90;
      }
      else if (total <= 200)
      {
         total = total * 0.85;
      }
      else
      {
         total = total * 0.80;
      }
      
      System.out.printf("O valor total é: R$%.2f", total);
   }
}
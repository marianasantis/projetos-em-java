import java.util.Scanner;

public class ContaBancaria
{
   public static void main (String args [])
   {
      Scanner leitor = new Scanner (System.in);
      int conta, n, digito, soma = 0;
      
      System.out.println("Digite o número da conta bancária: ");
      conta = leitor.nextInt();
      
      n = conta;
      while (n > 0)
      {
         soma = soma + (n % 10);
         n = n / 10;
      }
      
      digito = soma % 10;
      
      System.out.printf("O número da conta é: %06d-%d", conta, digito);
   }
}  
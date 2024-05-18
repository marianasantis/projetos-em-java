/* Solicite a quantidade de funcionários de uma empresa e em seguida
solicite seus salários. Calcule e informe o salário médio dos funcionários.
Informe também o menor e o maior valor digitado. 

Faça um loop para validar se a quantidade (n) de funcionários informada é
maior que zero, ou seja, enquanto n<=0 exiba uma mensagem de erro e solicite
um novo valor de n. */

import java.util.Scanner;

public class Salarios
{
   public static void main(String args [])
   {
      Scanner leitor = new Scanner(System.in);
      
      System.out.println("Insira a quantidade de funcionários");
      int qtd = leitor.nextInt();
      
      while (qtd <= 0)
      {
         System.out.println("A quantidade é inválida! Digite novamente");
         qtd = leitor.nextInt();
      }
      
      double mediaSal = 0;
      double menorSal = 999999999;
      double maiorSal = 0;
      
      for (int i = 1; i <= qtd; i++)
      {
         System.out.println("Insira o salário do " + i + "º funcionário"); 
         double sal = leitor.nextDouble();
         
         if (sal < menorSal)
            menorSal = sal;
         else if (sal > maiorSal)
            maiorSal = sal;
         
         mediaSal = mediaSal + sal;
      }
      
      mediaSal = mediaSal / qtd;
      System.out.printf("O salário médio é: R$%.2f\n", mediaSal);
      System.out.printf("O menor salário é: R$%.2f\n", menorSal);
      System.out.printf("O maior salário é: R$%.2f\n", maiorSal);
   }
}
  
         

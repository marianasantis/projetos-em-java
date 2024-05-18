/* Crie uma classe conta que tenha como atributos: saldo e como 
métodos: consultar saldo, saque (não pode ser menor ou igual a zero 
e o valor deve existir na conta), depósito (não pode ser menor ou igual a zero). 
Crie classe teste para executar os métodos. */

import java.util.Scanner;

public class TesteConta
{
   public static void main(String args[])
   {
      Scanner leitor = new Scanner(System.in);
      Conta conta = new Conta(1000);
      
      System.out.println("O seu saldo é: " + conta.getSaldo());
      
      System.out.println("Digite o valor do depósito");
      double deposito = leitor.nextDouble();
      conta.deposito(deposito);
      
      System.out.println("Digite o valor do saque");
      double saque = leitor.nextDouble();
      conta.saque(saque);
      
      System.out.print("O seu saldo atual é: " + conta.getSaldo());
   }
}
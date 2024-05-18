/* Crie uma classe conta que tenha como atributos: saldo e como 
métodos: consultar saldo, saque (não pode ser menor ou igual a zero 
e o valor deve existir na conta), depósito (não pode ser menor ou igual a zero). 
Crie classe teste para executar os métodos. */

public class Conta
{
   private double saldo;
   
   
   public Conta()
   {
   }
   
   public Conta(double saldo)
   {
      this.saldo = saldo;
   }
   
   public double getSaldo()
   {
      return saldo;
   }
   
   public void saque(double valor)
   {
      if (valor > 0 && valor <= saldo)
         this.saldo = this.saldo - valor;
   }  
      
   public void deposito(double valor)
   {
      if (valor > 0)
      this.saldo = this.saldo + valor;
   }
}
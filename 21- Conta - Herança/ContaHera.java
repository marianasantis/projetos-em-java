/* Elabore as classes ContaHera, ContaPoupanca e ContaEmpresa e classe teste 
para a UML da imagem ContaHera.jpeg */

public class ContaHera
{
   protected int numero;
   protected String titular;
   protected double saldo;
   
   public ContaHera()
   {
      setNumero(0);
      setTitular("");
      setSaldo(0);
   }
   
   public ContaHera(int numero, String titular, double saldo)
   {
      setNumero(numero);
      setTitular(titular);
      setSaldo(saldo);
   }
   
   public void setNumero(int numero)
   {
      this.numero = numero;
   }
   
   public int getNumero()
   {
      return numero;
   }
   
   public void setTitular(String titular)
   {
      this.titular = titular;
   }
   
   public String getTitular()
   {
      return titular;
   }
   
   public void setSaldo(double saldo)
   {
      this.saldo = saldo;
   }
   
   public double getSaldo()
   {
      return saldo;
   }
   
   public void saque(double valor)
   {
      if(valor >= saldo)
      {
         saldo -= valor;
      }
   }
   
   public void deposito(double valor)
   {
      if(valor > 0)
      {
         saldo += valor;
      }
   }
   
   public void imprime()
   {
      System.out.printf("Conta: %d\nTitular: %s\nSaldo: %.2f\n",
                                        numero, titular, saldo); 
   } 
}
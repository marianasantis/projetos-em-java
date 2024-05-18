/* Elabore as classes ContaHera, ContaPoupanca e ContaEmpresa e classe teste 
para a UML da imagem ContaHera.jpeg */

public class ContaPoupanca extends ContaHera
{
   private double taxaJuros;
   
   public ContaPoupanca()
   {
      super();
   }
   
   public ContaPoupanca(int numero, String titular, 
                     double saldo, double taxaJuros)
   {
      super(numero, titular, saldo);
      setTaxaJuros(taxaJuros);
   }
   
   public void setTaxaJuros(double taxaJuros)
   {
      this.taxaJuros = taxaJuros;
   }
   
   public double getTaxaJuros()
   {
      return taxaJuros;
   }
   
   public double atualizaSaldo()
   {
      setSaldo(getSaldo() * (getTaxaJuros() / 100 + 1));
      return getSaldo();
   }
   
   public void imprime()
   {
      super.imprime();
      System.out.printf("\nRendeu %.2f%%", getTaxaJuros());
      System.out.printf("\nSaldo Atual: %.2f\n", atualizaSaldo());                  
   }
}
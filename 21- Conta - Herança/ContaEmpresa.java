public class ContaEmpresa extends ContaHera
{
   private double limiteEmprestimo;
   
   public ContaEmpresa()
   {
      super();
   }
   
   public ContaEmpresa(int numero, String titular, 
         double saldo, double limiteEmprestimo)
   {
      super(numero, titular, saldo);
      setLimite(limiteEmprestimo);
   }
   
   public void setLimite(double limiteEmprestimo)
   {
      this.limiteEmprestimo = limiteEmprestimo;
   }
   
   public double getLimite()
   {
      return limiteEmprestimo;
   }
   
   public void emprestimo(double valor)
   {
      if(valor <= getLimite())
      {
         setSaldo(getSaldo() + valor);
      }
   }
   
   public void imprime()
   {
      super.imprime();
      System.out.printf("\nO seu limite de empréstimo é: %.2f\n", getLimite());
      emprestimo(200);
      System.out.print("Tentando realizar empréstimo de R$200,00");
      System.out.printf("\nSaldo Atual: %.2f\n", getSaldo());
   }
}
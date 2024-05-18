public class TesteContaHera
{
   public static void main(String args[])
   {
      ContaHera cp = new ContaPoupanca(12345, "Mariana de Santis", 250, 10);
      ContaHera cp2 = new ContaPoupanca();
      
      cp.imprime();
   }
}
      
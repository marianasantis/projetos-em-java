/* Elabore as classes ContaHera, ContaPoupanca e ContaEmpresa e classe teste 
para o diagrama de classes da imagem diagramaDeClasses.jpg */

public class TesteContaHera
{
   public static void main(String args[])
   {
      ContaHera poupanca = new ContaPoupanca(12345, "Mariana de Santis", 250, 10);
      ContaHera empresa = new ContaEmpresa(12345, "Mariana de Santis", 250, 400);
      
      poupanca.imprime();
      empresa.imprime();
   }
}

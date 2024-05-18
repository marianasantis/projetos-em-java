public class TesteProduto
{
   public static void main(String args[])
   {
      Produto p1 = new Produto(100, "LAPIS", 1);
      Produto p2 = new Produto(101, "CANETA", 2);
      
      System.out.println("Valor inicial de p1 é: " + p1.getPreco());
      System.out.println("Valor inicial de p2 é: " + p2.getPreco());
      
      //DAR DESCONTOS PADRÃO PARA P1 E 50% PARA P2
      
      p1.rebaixarPreco();
      p2.rebaixarPreco(50);
      
      System.out.println("Valor atual de p1 é: " + p1.getPreco());
      System.out.print("Valor atual de p2 é: " + p2.getPreco());
   }
}
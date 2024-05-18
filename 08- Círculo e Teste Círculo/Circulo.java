/* Crie uma classe círculo que tenha como atributo: raio e como métodos: alterar raio (não pode ser menor que zero), 
ler raio e exibir dados. Crie classe teste para exibir dados do objeto. */

public class Circulo
{
   private double raio;
   
   
   public void setRaio(double r) 
   {
      if (r < 0)
         System.out.print("O valor não pode ser negativo");
      else
         raio = r;
   }
   
   public double getRaio()
   {
      return raio;
   }
   
   public void exibirDados()
   {
      System.out.print("Raio: " + getRaio());
   }
}   
      
         
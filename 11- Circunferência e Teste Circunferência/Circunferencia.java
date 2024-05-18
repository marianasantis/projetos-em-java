/* Elaborar classe circunferência capaz de retornar o valor da área, perímetro e diâmetro.
Crie classe teste para testar a classe criada */

public class Circunferencia
{
   private double raio;
   
   public Circunferencia()
   {
   }
   
   public Circunferencia (double raio)
   {
      setRaio(raio);
   }
   
   public void setRaio(double raio)
   {
      this.raio = raio;
   }
   
   public double getArea()
   {
      return 3.14 * raio * raio;
   }
   
   public double getPerimetro()
   {
      return 2 * 3.14 * raio;
   }
   
   public double getDiametro()
   {
      return 2 * raio;
   }
}
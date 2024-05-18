/* Usando polimorfismo, crie uma super classe chamada polígono com método abstrato que calcula área.
Implemente esse método nas classes quadrado, retângulo e triângulo.
O usuário deve selecionar um polígono. Crie classe para testar */

public class QuadradoPolimorfismo extends PoligonoPolimorfismo
{
   private double lado;
   
   public QuadradoPolimorfismo(double lado)
   {
      this.lado = lado;
   }
   
   public double calcularArea()
   {
      return lado*lado;
   }
}
      
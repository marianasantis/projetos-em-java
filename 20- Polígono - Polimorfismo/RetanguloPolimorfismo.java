/* Usando polimorfismo, crie uma super classe chamada polígono com método abstrato que calcula área.
Implemente esse método nas classes quadrado, retângulo e triângulo.
O usuário deve selecionar um polígono. Crie classe para testar */

public class RetanguloPolimorfismo extends PoligonoPolimorfismo
{
   private double base;
   private double altura;
   
   public RetanguloPolimorfismo(double base, double altura)
   {
      this.base = base;
      this.altura = altura;
   }
   
   public double calcularArea()
   {
      return base*altura;
   }
}
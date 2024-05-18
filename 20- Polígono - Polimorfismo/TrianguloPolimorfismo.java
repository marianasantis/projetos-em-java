/* Usando polimorfismo, crie uma super classe chamada polígono com método abstrato que calcula área.
Implemente esse método nas classes quadrado, retângulo e triângulo.
O usuário deve selecionar um polígono. Crie classe para testar */

public class TrianguloPolimorfismo extends PoligonoPolimorfismo
{
   private double base;
   private double altura;
   
   public TrianguloPolimorfismo(double base, double altura)
   {
      this.base = base;
      this.altura = altura;
   }
   
   public double calcularArea()
   {
      return base * altura / 2;
   }
}
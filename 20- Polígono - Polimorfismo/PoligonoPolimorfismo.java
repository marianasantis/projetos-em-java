/* Usando polimorfismo, crie uma super classe chamada polígono com método abstrato que calcula área.
Implemente esse método nas classes quadrado, retângulo e triângulo.
O usuário deve selecionar um polígono. Crie classe para testar */

public abstract class PoligonoPolimorfismo 
{
   private double area;
   
   public abstract double calcularArea();
}
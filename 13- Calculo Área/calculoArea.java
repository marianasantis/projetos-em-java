/* Elaborar um programa simples (sem criar classes) que tenha os métodos 
sobrecarregados para cálculo da área de um terreno nos formatos (a) quadrado; 
(b) retangular. Faça um programa mostrando o uso destes métodos. */


public class calculoArea
{
   public static void main(String args[])
   {
      calcularArea(2);
      calcularArea(4,3);
   }
   
   public static void calcularArea(double lado)
   {
      System.out.println("A área do quadrado é: " + lado * lado);
   }   
   
   public static void calcularArea(double base, double altura)
   {
      System.out.print("A área do retângulo é: " + base * altura);
   }   
}
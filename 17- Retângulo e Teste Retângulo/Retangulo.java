/* Crie uma classe retângulo que tenha como atributos: base e altura e como 
métodos: consultar e alterar base e altura (não pode ser menor que zero), 
consultar área e perímetro, informar se é um não ou quadrado (true/false) e 
exibir dados. Crie classe teste. */

public class Retangulo
{
   private double base, altura;
   
   
   public Retangulo()
   {
      setBase(2);
      setAltura(1);   
   }
   
   public Retangulo(double base, double altura)
   {
      setBase(base);
      setAltura(altura);
   }
   
   public void setBase(double base)
   {
      if (base > 0)
         this.base = base;
      else
         this.base = 0;
   }
   
   public double getBase()
   {
      return base;
   }
   
   public void setAltura(double altura)
   {
      if (altura > 0)
         this.altura = altura;
      else
         this.altura = 0;
   }
   
   public double getAltura()
   {
      return altura;
   }
   
   public double getArea()
   {
      return base * altura;
   }
   
   public double getPerimetro()
   {
      return 2 * base + 2 * altura;
   }
   
   public boolean isQuadrado()
   {
      if (base == altura)
         return true;
      else
         return false;
   }
   
   public void exibirDados()
   {
      System.out.printf("\nBase: %.2f", getBase());
      System.out.printf("\nAltura: %.2f", getAltura());
      System.out.printf("\nÁrea: %.2f", getArea());
      System.out.printf("\nPerímetro: %.2f", getPerimetro());
      System.out.printf("\nÉ um quadrado? %b", isQuadrado());
   }
}
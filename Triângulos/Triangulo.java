import java.util.Scanner;

public class Triangulo
{
   public static void main ( String args [] )
   {
      Scanner leitor = new Scanner( System.in );
      
      System.out.println( "Digite o tamanho da primeira reta: " );
      double lado1 = leitor.nextDouble();
      
      System.out.println( "Digite o tamanho da segunda reta: " );
      double lado2 = leitor.nextDouble();
      
      System.out.println( "Digite o tamanho da terceira reta: " );
      double lado3 = leitor.nextDouble();
   
      if (( lado1 + lado2 ) > lado3 && 
         ( lado1 + lado3 ) > lado2 && 
         ( lado2 + lado3 ) > lado1 )
      {
         if ( lado1 == lado2 && lado2 == lado3 )
         {
            System.out.println( "É um triângulo equilátero" );
         }
         else if ( lado1 != lado2 && lado2 != lado3 )
         {
            System.out.println( "É um triângulo escaleno" );
         }
         else
         {
            System.out.println( "É um triângulo isósceles" );
         }  
      }  
      else 
      {
         System.out.println( "Não é um triângulo!" );
      }
   }
}
    
  
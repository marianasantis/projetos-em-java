import java.util.Scanner;

public class Calculadora
{
   public static void main ( String args [] )
   {
      Scanner leitorNum = new Scanner ( System.in );
      Scanner leitorString = new Scanner ( System.in );
      
      System.out.println( "Digite o primeiro valor: " );
      double val1 =  leitorNum.nextDouble();
      
      System.out.println( "Digite o operador: " );
      String stringOpe = leitorString.nextLine(); 
      char charOpe = stringOpe.charAt(0);
      
      System.out.println( "Digite o segundo valor: " );
      double val2 = leitorNum.nextDouble();
      
      switch ( charOpe )
      {
         case '+': System.out.println( "A soma eh: " + (val1 + val2) );
                   break;
                   
         case '-': System.out.println( "A diferenca eh: " + (val1 - val2) );
                   break;
                   
         case '*': System.out.println( "O produto eh: " + (val1 * val2) );
                   break;
                   
         case '/': if (val2 == 0)
                   {
                      System.out.println( "ERRO! Divisao por 0" );
                      break;
                   }
                   
                   System.out.println( "O quociente eh: " + (val1 / val2) );
                   break;
                   
         default: System.out.println ( "Conta invalida" );
      }
   }
}
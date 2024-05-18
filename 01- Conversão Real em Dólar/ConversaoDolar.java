import java.util.Scanner;

public class ConversaoDolar
{
  public static void main ( String args [] ) 
  {
    Scanner leitor = new Scanner ( System.in );
    
    double reais;
    double dolares;
    
    System.out.print( "Digite o valor em reais: " );
    reais = leitor.nextDouble();
    
    dolares = reais / 5.08;
    
    System.out.printf( "Isso equivale a: %.2f dolares", dolares );
  }
}    
    

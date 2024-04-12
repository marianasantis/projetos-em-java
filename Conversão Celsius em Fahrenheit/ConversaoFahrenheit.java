import java.util.Scanner;

public class ConversaoFahrenheit
{
  public static void main ( String args [] )
  {
    Scanner leitor = new Scanner (System.in);
    
    double cels;
    double fah;
    
    System.out.print( "Digite a temperatura em Celsius:\n");
    cels = leitor.nextDouble();
    
    fah = cels * 1.8 + 32;
    
    System.out.printf( "Temperatura de:\n %.2f Fahrenheit", fah );
  }
}
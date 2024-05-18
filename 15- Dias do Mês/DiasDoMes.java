public class DiasDoMes
{
   public static void main (String args[])
   {
      int diasDoMes[] =
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
         
      String meses[] = { "", "Jan", "Fev", "Mar", "Abr", "Mai",
         "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };
         
      System.out.printf( "%s %9s\n", "Mês", "Dias" );
      
      for ( int i = 1; i < diasDoMes.length; i++ )
         System.out.printf( "%02d (%3s) %4d\n", i,
                              meses [ i ], diasDoMes[ i ] );
   }
} 
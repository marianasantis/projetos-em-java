public class ImprimirArray
{
   public static void main (String args[])
   {
      int a1[][] = { {1, 2}, {3}, {4, 5, 6} };
      exibeArray(a1);
   }
   
   public static void exibeArray(int v[][])
   {
      int lin, col;
      for (lin = 0; lin < v.length; lin++)
      {
         for (col = 0; col < v[ lin ].length; col++)
            System.out.printf("%d ", v[ lin ][ col ]);
      }
   }
}
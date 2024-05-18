/* Faça um programa que leia as 2 notas de um aluno, calcule e exiba a média aritmética das notas 
e se o mesmo foi aprovado (M >= 7), reprovado (M < 4) ou está de recuperação (4 <= M < 7) */

import java.util.Scanner;

public class Media
{
   public static void main ( String args [] )
   {
      Scanner leitor = new Scanner ( System.in );
      
      System.out.println( "Digite a primeira nota: " );
      double nota1 = leitor.nextDouble();
      
      System.out.println( "Digite a segunda nota: " );
      double nota2 = leitor.nextDouble();
      
      double media = ( nota1 + nota2 ) / 2 ;
      
      if ( media < 4 )
      {
         System.out.println( "Aluno reprovado com media " + media );
      }
      else if ( media >= 7 )
      { 
         System.out.println( "Aluno aprovado com media " + media );
      }
      else 
      {
         System.out.println( "Aluno em recuperacao com media " + media );
      }
   }
}
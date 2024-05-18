import java.util.Scanner;

public class MediaTurma
{
   public static void main(String args[])
   {
      final int ALUNOS = 5;
      final int PROVAS = 3;
      
      int lin, col;
      double media;
      double mediaTurma = 0;
      
      Scanner leitor = new Scanner(System.in);
      double notas[][] = new double[ALUNOS][PROVAS];
      
      for (lin = 0; lin < ALUNOS; lin++)
      {
         media = 0;
         System.out.printf("%s %1d %s", "Digite as notas do", lin+1, "º aluno\n");
         
         for (col = 0; col < PROVAS - 1; col++)
         {
            notas[lin][col] = leitor.nextDouble();
            media += notas[lin][col];
         }
         
         notas[lin][PROVAS - 1] = media / (PROVAS - 1);
         mediaTurma += notas[lin][PROVAS -1];
      }
      
      mediaTurma = mediaTurma / ALUNOS;
      
      System.out.println();
      System.out.println("Notas e Média");
         
      for (lin = 0; lin < ALUNOS; lin++)
      {
         System.out.printf("\nAluno %d: ", lin+1);
         
         for (col = 0; col < PROVAS - 1; col++)
         {
            System.out.printf("%2.2f ", notas[lin][col]);
         }
         
         System.out.printf("- Média %2.2f", notas[lin][PROVAS -1]);
         if (notas[lin][PROVAS -1] < mediaTurma)
            System.out.print("- Abaixo da média da turma");
         else if (notas[lin][PROVAS -1] == mediaTurma)
            System.out.print("- Na média da turma"); 
         else
            System.out.print("- Acima da média da turma");
      }
   }
}
            

         
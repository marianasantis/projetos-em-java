/* Usando polimorfismo, crie uma super classe chamada polígono com método abstrato que calcula área.
Implemente esse método nas classes quadrado, retângulo e triângulo.
O usuário deve selecionar um polígono. Crie classe para testar */

import java.util.Scanner;

public class TestePoligonoPolimorfismo
{
   public static void main (String args[])
   {
      int opcao;
      double area;
      
      Scanner leitor = new Scanner(System.in);
      
      PoligonoPolimorfismo p = null;
      PoligonoPolimorfismo q = new QuadradoPolimorfismo(2);
      PoligonoPolimorfismo r = new RetanguloPolimorfismo(3,5);
      PoligonoPolimorfismo t = new TrianguloPolimorfismo(7,4);
      
      System.out.println("CÁLCULO DA ÁREA:");
      System.out.println("[1] - QUADRADO");
      System.out.println("[2] - RETÂNGULO");
      System.out.println("[3] - TRIÂNGULO");
      System.out.println("Selecione uma opção:");
      
      opcao = leitor.nextInt();
      
      switch(opcao)
      {
         case 1: p = q; break;
         case 2: p = r; break;
         case 3: p = t; break;
         default: System.out.println("Opção inválida.");
      }
      
      area = p.calcularArea();
      
      System.out.print("A área é " + area);
   }
}
      
 
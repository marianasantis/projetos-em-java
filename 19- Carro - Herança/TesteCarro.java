/* Crie classe Veículo (atributos: modelo, placa, ano de fabricação e valor) e suas subclasses Carro 
(atributos: ano do modelo e número de portas) e caminhão (capacidade e número de eixos) com setters e 
getters e método de depreciação. Faça as classes dos seus respectivos testes e imprima */

public class TesteCarro
{
   public static void main(String args[])
   {
      Carro c1 = new Carro("Vectra", "ABC1234", 1998, 20000, 4, 1999);
     
      c1.imprime();
     
      c1.deprecia(10);
      System.out.println(" ");
      System.out.println("Carro depreciado:");
      c1.imprime();
   }
}
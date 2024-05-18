/* Crie classe Veículo (atributos: modelo, placa, ano de fabricação e valor) e suas subclasses Carro 
(atributos: ano do modelo e número de portas) e caminhão (capacidade e número de eixos) com setters e 
getters e método de depreciação. Faça as classes dos seus respectivos testes e imprima */

public class TesteCaminhao
{
   public static void main(String args[])
   {
      Caminhao cam1 = new Caminhao("MB710", "DEF5678", 2008, 170000, 6000, 2);
     
      cam1.imprime();
     
      cam1.deprecia(10);
      System.out.println(" ");
      System.out.println("Caminhão depreciado");
      cam1.imprime();
   }
} 
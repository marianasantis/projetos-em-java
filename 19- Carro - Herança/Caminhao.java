/* Crie classe Veículo (atributos: modelo, placa, ano de fabricação e valor) e suas subclasses Carro 
(atributos: ano do modelo e número de portas) e caminhão (capacidade e número de eixos) com setters e 
getters e método de depreciação. Faça as classes dos seus respectivos testes e imprima */

public class Caminhao extends Veiculo
{
   private double capacidade;
   private int numEixos;
   
   public Caminhao(String modelo, String placa, int anoFabr, 
               double valor, double capacidade, int numEixos)
   {
      super(modelo, placa, anoFabr, valor);
      setCapacidade(capacidade);
      setNumEixos(numEixos);
   }
   
   public void setCapacidade(double capacidade)
   {
      this.capacidade = capacidade;
   }
   
   public double getCapacidade()
   {
      return capacidade;
   }
   
   public void setNumEixos(int numEixos)
   {
      this.numEixos = numEixos;
   }
   
   public int getNumEixos()
   {
      return numEixos;
   }
   
    public void imprime()
   {
      System.out.printf("Veículo: %s\nPlaca: %7s\nFabr: %4d\nValor: R$%.2f\n%.2f Kg\nEixos: %d", 
                                             modelo, placa, anoFabr, valor, capacidade, numEixos);
   }
}
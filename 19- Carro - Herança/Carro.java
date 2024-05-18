/* Crie classe Veículo (atributos: modelo, placa, ano de fabricação e valor) e suas subclasses Carro 
(atributos: ano do modelo e número de portas) e caminhão (capacidade e número de eixos) com setters e 
getters e método de depreciação. Faça as classes dos seus respectivos testes e imprima */

public class Carro extends Veiculo
{
   private int numPortas;
   private int anoModelo;
   
   public Carro(String modelo, String placa, int anoFabr, 
            double valor, int numPortas, int anoModelo)
   {
      super(modelo, placa, anoFabr, valor);
      setNumPortas(numPortas);
      setAnoModelo(anoModelo);
   }
   
   public void setNumPortas(int numPortas)
   {
      this.numPortas = numPortas;      
   }
   
   public int getNumPortas()
   {
      return numPortas;
   }
   
   public void setAnoModelo(int anoModelo)
   {
      this.anoModelo = anoModelo;
   }
   
   public int getAnoModelo()
   {
      return anoModelo;
   }

   public void imprime()
   {
      System.out.printf("Veículo: %s\nPlaca: %7s\nFabr: %4d\nModelo: %4d\nValor: R$%.2f\nPortas: %1d", 
                                                modelo, placa, anoFabr, anoModelo, valor, numPortas);
   }
}
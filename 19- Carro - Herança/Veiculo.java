/* Crie classe Veículo (atributos: modelo, placa, ano de fabricação e valor) e suas subclasses Carro 
(atributos: ano do modelo e número de portas) e caminhão (capacidade e número de eixos) com setters e 
getters e método de depreciação. Faça as classes dos seus respectivos testes e imprima */

public class Veiculo
{
   protected String modelo, placa;
   protected int anoFabr;
   protected double valor;

   public Veiculo(String modelo, String placa, int anoFabr, double valor)
   {
      setModelo(modelo);
      setPlaca(placa);
      setAnoFabr(anoFabr);
      setValor(valor);
   }
   
   public void setModelo(String modelo)
   {
      this.modelo = modelo;
   }
   
   public String getModelo()
   {
      return modelo;
   }
   
   public void setPlaca(String placa)
   {
      this.placa = placa;
   }
   
    public String getPlaca()  
   {
      return placa;
   }
   
   public void setAnoFabr(int anoFabr)
   {
      this.anoFabr = anoFabr;
   }
   
   public int getAnFabro()
   {
      return anoFabr;
   }
   
   public void setValor(double valor)
   {
      if (valor > 0)    this.valor = valor;
      else              this.valor = 0;
   }
   
    public double getValor()
   {
      return valor;
   }
   
   public void deprecia(double taxa)
   {
      setValor(valor - valor * taxa / 100);
   }
}

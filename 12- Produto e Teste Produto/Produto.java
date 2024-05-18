public class Produto
{
   private int codigo;
   private String nome;
   private double preco;
   
   public Produto()
   {
   }
   
   public Produto(int codigo, String nome, double preco)
   {
      this.codigo = codigo;
      this.nome = nome;
      this.preco = preco;
   }
   
   public void rebaixarPreco()
   {
      preco = preco - preco * 0.1;
   }
   
   public void rebaixarPreco(double porcent)
   {
      preco = preco - porcent / 100 * preco;
   }
   
   public double getPreco()
   {
      return preco;
   }
   
   public void setPreco(double preco)
   {
      if (preco > 0)
         this.preco = preco;
      else
         this.preco = 0;
   }
}  
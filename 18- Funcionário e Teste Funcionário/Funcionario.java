public class Funcionario
{
   private String nome, email;
   private int idade;
   
   public Funcionario()
   {
   }
   
   public Funcionario(String nome, String email)
   {
      this.nome = nome;
      this.email = email;
   }
   
   public Funcionario(String nome, String email, int idade)
   {
      this.nome = nome;
      setEmail(email);
      setIdade(idade);
   }
   
   public void setEmail(String email)
   {
      this.email = email;
   } 
   
   public void setIdade(int idade)
   {
      this.idade = idade;
   }
   
   public void exibeDados()
   {
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Email: " + email);
   }
}
public class Contato{
  private String nome;
  private String email;
  private String celul;

  public Contato(String nome, String email, String celul){
    this.nome = nome;
    this.email = email;
    this.celul = celul;
  }

  public String getNome() {
	   return nome;
  }

  public void setNome(String nome) {
	   this.nome = nome;
  }

  public String getEmail() {
	   return email;
  }

  public void setEmail(String email) {
	   this.email = email;
  }

  public String getCelul() {
	   return celul;
  }

  public void setCelul(String celul) {
	   this.celul = celul;
  }

  @Override
  public String toString() {
    return "Nome: "+this.nome+", Email: "+this.email+", Celular: "+this.celul;
  }
  
}
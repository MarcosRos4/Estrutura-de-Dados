public class Teste{
  public static void main(String args[]){
    Vetor vetor = new Vetor(5);    

    Contato marcos = new Contato("Marcos Rosa", "marcos.vcrosa@senacsp.edu.br", "11912345678");
    Contato ivomet = new Contato("Ivo Bueno", "ivo.bgouveia@senacsp.edu.br", "11909876543");
    Contato thomas = new Contato("Thomas Ferreira", "thomas.fsilva@senacsp.edu.br", "11945896734");
    Contato matuli = new Contato("Lucas Matulis", "lucas.m@senacsp.edu.br", "11912093487");
    Contato vicsto = new Contato("Victoria Franca", "victoria.foliveira@senacsp.edu.br", "11932895467");
    
    try{
      vetor.adiciona(marcos);
      vetor.adiciona(ivomet);
      vetor.adiciona(thomas);
      vetor.adiciona(matuli);
      vetor.adiciona(vicsto);
      
    }
    catch(Exception e){
      e.printStackTrace();
    }

    System.out.println("Tamanho do vetor: " + vetor.tamanho());
    System.out.println(vetor);
  }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vetor thomas = new Vetor(10);

        // ADICIONAR ELEMENTOS
        try {
            thomas.adiciona("Thomas Primeiro");
        }
        catch(Exception e){
            e.printStackTrace();
        }

        // IMPRIMIR VETOR
        System.out.println(thomas);

        // IMPRIMIR TAMANHO ATUAL
        System.out.println(thomas.tamanho());

        // BUSCA DE ELEMENTO POR INDICE
        try {
            System.out.println(thomas.buscaPosicao(0));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        // BUSCA DE ELEMENTO POR CONTEUDO
        System.out.println(thomas.buscaConteudo("Thomas Primeiro"));

        // ADICIONAR ELEMENTO NO INCIO DO VETOR
        try {
            thomas.adicionaInicio(0,"Ivo Bueno Segundo");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(thomas);

        // REMOVER CONTEUDO POR INDICE
        try {
            thomas.remove(0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(thomas);
    }
}
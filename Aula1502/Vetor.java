import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;
    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        this.tamanho = 0;
    }
    public void adiciona(String elemento)throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        else {
            throw new Exception("O Vetor já esta cheio, não é possivel" +
                    " adicionar novos elementos");
        }
    }
    public int tamanho(){
        return this.tamanho;
    }


    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                '}';
    }


    public String buscaPosicao(int posicao)throws Exception{
        if (posicao >=0 && posicao < this.tamanho){
            return elementos[posicao];
        }
        else {
            throw new Exception("Posicao Invalida");
        }

    }

    public int buscaConteudo (String elemento) {
        for (int i=0; i<tamanho; i++){
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adicionaInicio(int possicao, String elemento)throws Exception{
        this.aumentaCapacidade();
        if (possicao>=0 && possicao < tamanho){
            for (int i = this.tamanho-1; i > possicao ; i--) {
                this.elementos[i+1] = this.elementos[i];
            }
            this.elementos[possicao] = elemento;
            this.tamanho++;
        }else {
            throw new Exception("Posicao Invalida");
        }
        return true;
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) throws Exception{
        if(posicao >=0 && posicao < tamanho){
            for (int i = posicao; i < this.tamanho-1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        }
        else {
            throw  new Exception("Posicao Invalida");
        }
    }

    /*
    public String busca(int posicao) {
    pass
    }

    public int tamanho() {

    }
    public String toString() {

    }*/
}


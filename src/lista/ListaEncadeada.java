package lista;
public class ListaEncadeada<T> {

    private No<T> start;
    private No<T> end;
    private int tamanho = 0;

    public void adiciona(T elemento) {

        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.start = celula;
        } else {
            this.end.setProximo(celula);
        }
        this.end = celula;
        this.tamanho++;
    }

    public int GetTamanho(){
        return this.tamanho;
    }

    public void limpa (){

        for (No<T> atual = this.start; atual != null;) {
            
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.start = null;
        this.end = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        
        if (this.tamanho == 0) {
            return "[ ]";
        }

        StringBuilder builder = new StringBuilder();

        No <T> atual = this.start;

        for (int i = 0; i < this.tamanho;  i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }
        
        
        /* 

        

        
        builder.append(atual.getElemento()).append(", ");
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(", ");
        } */


        return builder.toString();
    }

    

}
public class ListaEstatica<T> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionar(T elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
        }
    }

    public boolean remover(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            elementos[tamanho - 1] = null;
            tamanho--;
            return true;
        } else {
            return false;
        }
    }

    public boolean estaCheia() {
        return tamanho == elementos.length;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }
}
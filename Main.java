public class Main {
    public static void main(String[] args) {
        ListaEstatica<String> lista = new ListaEstatica<>(5);

        lista.adicionar("Elemento 1");
        lista.adicionar("Elemento 2");
        lista.adicionar("Elemento 3");

        lista.exibir();

        lista.remover(1);

        System.out.println("Após remover o segundo elemento:");
        lista.exibir();
    }
}

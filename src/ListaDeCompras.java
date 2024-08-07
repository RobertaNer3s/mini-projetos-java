import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Item> itens;

    public ListaDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        itens.add(new Item(nome, quantidade));
    }

    public void removerItem(String nome) {
        itens.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public void exibirLista() {
        if (itens.isEmpty()) {
            System.out.println("A lista de compras está vazia.");
        } else {
            System.out.println("Lista de Compras:");
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }
}

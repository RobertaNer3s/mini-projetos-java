public class Item {private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return quantidade + " x " + nome;
    }

}

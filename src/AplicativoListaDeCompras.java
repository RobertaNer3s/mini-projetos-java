import java.util.Scanner;

public class AplicativoListaDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    listaDeCompras.adicionarItem(nome, quantidade);
                    System.out.println("Item adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    listaDeCompras.removerItem(nomeRemover);
                    System.out.println("Item removido com sucesso!");
                    break;
                case 3:
                    listaDeCompras.exibirLista();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}


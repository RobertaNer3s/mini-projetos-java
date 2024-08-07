import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Digite uma opção do menu:");
            System.out.println("1 - Pizza");
            System.out.println("2 - Sanduiche");
            System.out.println("3 - Sorvete");
            System.out.println("0 - Sair");


            opcao = scanner.nextInt();
            if (opcao == 0) {
                System.out.println("Saindo do programa...");
            } else if (opcao == 1) {
                System.out.println("Você escolheu uma Pizza, aguarde seu pedido estará sendo preparado, se desejar algo mais escolha no menu");
            } else if (opcao == 2 ){
                System.out.println("Você escolheu um sanduiche, aguarde seu pedido estará sendo preparado, se desejar algo mais escolha no menu ");
            } else {
                System.out.println("Você escolheu um sorvete, aguarde seu pedido estará sendo preparado, se desejar algo mais escolha no menu");
            }

        }  while (opcao != 0);

            scanner.close();

    }
}

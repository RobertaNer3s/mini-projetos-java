import java.util.Scanner;

public class ContadorDeLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");

        String frase = scanner.nextLine();
        int quantity = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                quantity++;
            }
        }

        System.out.println("A quantidade de letras é:" + quantity);
        scanner.close();
    }
}

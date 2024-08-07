import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoedas converter = new ConversorDeMoedas();

        System.out.println("Conversor de Moedas");
        System.out.println("Moedas disponíveis: USD, EUR, BRL");

        System.out.print("Digite a moeda de origem: ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Digite a moeda de destino: ");
        String toCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Digite o valor a ser convertido: ");
        double amount = scanner.nextDouble();

        try {
            double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
            System.out.printf("%.2f %s é igual a %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

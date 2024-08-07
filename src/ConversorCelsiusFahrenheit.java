import java.util.Scanner;

public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = leitorTeclado.nextDouble();
        leitorTeclado.close();
        double fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
    }
}

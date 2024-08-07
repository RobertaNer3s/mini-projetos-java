import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite o seu peso (em kilos):");
        float peso = leitorTeclado.nextFloat();
        System.out.println("Digite a sua altura (em centímetros):");
        float alturaCm = leitorTeclado.nextFloat();

        // Convertendo altura de centímetros para metros
        float alturaM = alturaCm / 100;

        // Calculando o IMC
        float imc = peso / (alturaM * alturaM);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Exibindo a faixa de IMC
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está com o peso ideal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está com obesidade.");
        }

        leitorTeclado.close();
    }
}

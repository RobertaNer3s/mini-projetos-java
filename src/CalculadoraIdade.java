import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        int anoNascimento = leitorTeclado.nextInt();
        System.out.println("Digite o ano atual:");
        int anoAtual = leitorTeclado.nextInt();;

        int idade = calculaIdade(anoNascimento, anoAtual);
        System.out.println("Sua idade é: " + idade + " anos");
    }
    public static int calculaIdade(int anoNascimento, int anoAtual) {
        int idade = anoAtual - anoNascimento;
        return idade;
    }
}

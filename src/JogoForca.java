import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class JogoForca {
    private static final int MAX_ERROS = 6;
    private String palavraSecreta;
    private Set<Character> letrasAdivinhadas;
    private Set<Character> letrasErradas;
    private int erros;

    public JogoForca(String palavraSecreta) {
        this.palavraSecreta = palavraSecreta.toUpperCase();
        this.letrasAdivinhadas = new HashSet<>();
        this.letrasErradas = new HashSet<>();
        this.erros = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        while (erros < MAX_ERROS && !todasLetrasAdivinhadas()) {
            exibirPalavra();
            System.out.println("Letras erradas: " + letrasErradas);
            System.out.println("Você tem " + (MAX_ERROS - erros) + " tentativas restantes.");
            System.out.print("Digite uma letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);

            if (!Character.isLetter(letra)) {
                System.out.println("Por favor, digite uma letra válida.");
                continue;
            }

            if (letrasAdivinhadas.contains(letra) || letrasErradas.contains(letra)) {
                System.out.println("Você já tentou essa letra.");
                continue;
            }

            if (palavraSecreta.indexOf(letra) >= 0) {
                letrasAdivinhadas.add(letra);
            } else {
                letrasErradas.add(letra);
                erros++;
            }
        }

        scanner.close();
        exibirResultado();
    }

    private void exibirPalavra() {
        StringBuilder exibicao = new StringBuilder();
        for (char letra : palavraSecreta.toCharArray()) {
            if (letrasAdivinhadas.contains(letra)) {
                exibicao.append(letra).append(" ");
            } else {
                exibicao.append("_ ");
            }
        }
        System.out.println("Palavra: " + exibicao.toString().trim());
    }

    private boolean todasLetrasAdivinhadas() {
        for (char letra : palavraSecreta.toCharArray()) {
            if (!letrasAdivinhadas.contains(letra)) {
                return false;
            }
        }
        return true;
    }

    private void exibirResultado() {
        if (todasLetrasAdivinhadas()) {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavraSecreta);
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra secreta: ");
        String palavraSecreta = scanner.nextLine().toUpperCase();
        JogoForca jogo = new JogoForca(palavraSecreta);
        jogo.jogar();
        scanner.close();
    }
}


import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] palavras = {"banana", "laranja", "abacaxi", "uva", "manga", "melancia"};
        String palavraAleatoria = palavras[(int) (Math.random() * palavras.length)];
        char[] letras = new char[palavraAleatoria.length()];
        int tentativas = 6;

        for (int i = 0; i < letras.length; i++) {
            letras[i] = '_';
        }

        System.out.println("Bem-vindo ao Jogo da Forca! Adivinhe a palavra:");
        while (tentativas > 0) {
            System.out.println(letras);

            System.out.print("Digite uma letra: ");
            char letra = input.next().charAt(0);

            boolean acertou = false;
            for (int i = 0; i < palavraAleatoria.length(); i++) {
                if (palavraAleatoria.charAt(i) == letra) {
                    letras[i] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                System.out.println("Letra incorreta! Você tem " + (--tentativas) + " tentativas restantes.");
            } else {
                System.out.println("Letra correta! Continue assim.");
            }

            if (palavraAleatoria.equals(new String(letras))) {
                System.out.println("Parabéns! Você venceu o Jogo da Forca!");
                return;
            }
        }

        System.out.println("Game over! A palavra era " + palavraAleatoria + ".");
    }

}

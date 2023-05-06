import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100);
        int palpite = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar um número entre 0 e 100.");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite um número: ");
            palpite = input.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            }
        }

        System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
    }

}

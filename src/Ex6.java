import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {-15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        System.out.println("os numeros positivo em seus lugares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println("Posição " + i + ": " + vetor[i]);
            }
        }
    }
}

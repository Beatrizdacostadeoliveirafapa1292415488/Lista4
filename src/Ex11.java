import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[]x=new int[20];


        System.out.println("digito 20 numeros:");
        for (int i=0;i<20;i++){
            System.out.print("elemento"+(i+1) +"é:");
            x[i]= scanner.nextInt();

        }

        Arrays.sort(x);

        System.out.println("\nnumeros em ordem crescente:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + x[i]);
        }

    }
}

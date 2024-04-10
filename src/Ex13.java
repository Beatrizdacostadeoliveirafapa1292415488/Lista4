import java.util.ArrayList;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]a=new int[30];
        int[]b=new int[30];

        System.out.println("digito 10 numeros para o a:");
        for (int i=0;i<30;i++){
            System.out.print("elemento"+(i+1) +"é:");
            a[i]= scanner.nextInt();
        }
        System.out.println("\ndigito 10 numeros para o B:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            b[i] = scanner.nextInt();
        }
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (a[i] == b[j]) {
                    integers.add(b[i]);
                    break;
                }
            }
        }
        System.out.println("\nElementos da interseção (vetor C):");
        for (int num : integers) {
            System.out.print(num + " ");}


    }
}

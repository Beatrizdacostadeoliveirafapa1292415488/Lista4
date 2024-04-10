import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]a=new int[10];
        int[]b=new int[10];
        int[]c=new int[10];


        System.out.println("digite numeros para o a :");
        for (int i=0;i<10;i++){
            System.out.print("digite o elemento:"+(i+1)+":");
            a[i]=scanner.nextInt();
        }

        System.out.println("\ndigite numeros para o b :");
        for (int i=0;i<10;i++) {
            System.out.print("digite o elemento:" + (i + 1) + ":");
            b[i] = scanner.nextInt();
        }

        for (int i=0;i<10;i++){
            c[i]=a[i]*b[i];
        }



        System.out.println("\n resultante C é:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }


    }
}

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[]A=new int[10];
        int[]B=new int[10];
        int[]C=new int[20];

        System.out.println("digito 10 numeros para o a:");
        for (int i=0;i<10;i++){
            System.out.print("elemento"+(i+1) +"é:");
            A[i]= scanner.nextInt();

        }
        System.out.println("digito 10 numeros para o b:");
        for (int i=0;i<10;i++){
            System.out.print("elemento"+(i+1) +"é:");
            B[i]= scanner.nextInt();
        }
        for (int i=0;i<10; ++i){
            C[i]=A[i];
            C[i+10]=B[i];
        }
        System.out.println("\no resultado de c:");
        for (int i=0;i<20;i++){
            System.out.println("C["+i+"]="+C[i]);
        }
    }
}

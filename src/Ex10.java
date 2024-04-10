import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] par = new int[10];
        int[] impaR= new int[10];

        int iPares = 0;
        int iimpar = 0;
        int numero;

        System.out.println("Digite os números:");

        while (true){
            numero=scanner.nextInt();
            if (numero == 0 || iimpar == 10 || iPares == 10){
                break;
            }
            if (numero%2==0){
                par[iPares++]=numero;
            }else{
                impaR[iimpar++]= numero;
            }


        }
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < iPares; i++) {
            System.out.print(par[i] + " ");
        }


        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < iimpar; i++) {
            System.out.print(impaR[i] + " ");
        }

    }
}

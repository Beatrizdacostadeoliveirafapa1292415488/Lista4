import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] vetor=new int[6];
        ;


        System.out.println("digite uma opção:");
        for (int i=0;i<6;i++){
            System.out.print("elemento"+(i+1)+":");
            vetor[i]=scanner.nextInt();
        }
        System.out.println("\nEscolha a opção :");
        System.out.println("1- Soma");
        System.out.println("2- Produto");
        System.out.println("3- Média");
        System.out.println("4-  vetor");
        System.out.print("? ");

        int soma=0;
        int produto=1;
        double media=2;
        int motre=3;
        int opcao;



        opcao=scanner.nextInt();

        switch (opcao){
            case 1:
                soma=0;
                for (int num:vetor){
                    soma+=num;
                }
                System.out.println("Soma dos elementos: " + soma);
                break;
            case 2:
                 produto = 1;
                for (int num : vetor) {
                    produto *= num;
                }
                System.out.println("Produto dos elementos: " + produto);
                break;
            case 3:
                int somaElementos = 0;
                for (int num : vetor) {
                    somaElementos += num;
                }
                 media = (double) somaElementos / vetor.length;
                System.out.println("Média dos elementos: " + media);
                break;
            case 4:
                System.out.println("Vetor:");
                for (int num : vetor) {
                    System.out.print(num + " ");
                }
                break;
            default:
                System.out.println("invalido!");
        }


        }

    }


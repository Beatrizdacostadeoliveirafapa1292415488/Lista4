import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int[]x=new int[10];
        int[]y=new int[10];

        System.out.println("digito 10 numeros:");
        for (int i=0;i<10;i++){
            System.out.print("elemento"+(i+1) +"é:");
            x[i]= scanner.nextInt();

        }

        for (int i=0;i<10;i++){
            if (i%2==0){
                y[i]=x[i]*2;

            }else {
                y[i]=x[i]*3;
            }
        }
        System.out.println("\n vetor y é:");
        for (int i=0;i<10;i++){
            System.out.println("O Y["+i+"] ="+y[i]);
        }


    }
}

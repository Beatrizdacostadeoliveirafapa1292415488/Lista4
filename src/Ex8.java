import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[]m=new int[10];
        int tempo;


        System.out.println("digito 10 numeros:");
        for (int i=0;i<10;i++){
            System.out.print("elemento"+(i+1) +"é:");
            m[i]= scanner.nextInt();

        }
        for(int i=0;i<5;i++){
            tempo=m[i];
            m[i]= m[i+5];
            m[i+5]=tempo;
        }
        System.out.println("\n vetor m  é:");
        for (int  i=0;i<10;i++){
            System.out.println("M["+i+"] = "+m[i]);
        }
    }

}

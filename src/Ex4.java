public class Ex4 {
    public static void main(String[] args) {
        int[] vetor = {22,23,24,25,26,27,28,28,29,30,31,32,33,34,35,36,37,38,39,40};
        int par;

        System.out.println("elementos:");
        vervetor(vetor);

        par = calcucalpar(vetor);
        System.out.println(" pares:" + par);


    }

    public static void vervetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static int calcucalpar(int[] vetor) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    }



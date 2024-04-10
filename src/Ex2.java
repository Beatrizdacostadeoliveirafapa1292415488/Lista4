import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[]a= new int[10];
        for (int i=0,valor=10; i< a.length;i++,valor+=10){
            a[i]=valor;

        }
        System.out.println(" após o preenchimento:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}

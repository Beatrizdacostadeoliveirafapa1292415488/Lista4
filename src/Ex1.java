import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[]X= new int[10];
        Arrays.fill(X,30);
        System.out.println(" após o preenchimento:");
        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }


    }
}

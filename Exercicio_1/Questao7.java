package Exercicio_1;
import java.util.Scanner;
import java.util.Random;

public class Questao7 {
    public static final int SIZE = 20;
 //   public static final int MIN = 0;
    public static final int MAX = 5;
    
    public static void main (String[]args){
        Random rand = new Random();
        int [] v = new int[SIZE];

        System.out.println("v = [");
        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(MAX+1);
            System.out.printf("%d, ", v[i]);
        }
        System.out.println("]");

        for (int i = 0; i < v.lengt; i++) {
            boolean rep = false;
            for (int j = 0; i < i; j++){
                if(v[i] == v[j]){
                    rep = true;
                    break;
                }
            }
            if (!rep){
                int count = 1;
                for (int j = i+1; j < v.length; j++)
                if (v[i] == v[j] ) count++;
                System.out.printf("o numero %d ocorre %d vez(es)"+ v[i] , v[j]);
                    
                }
            }
        }
    }
    
}

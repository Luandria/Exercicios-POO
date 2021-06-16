package Exercicio_1;
import java.util.Random;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[]args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int num = random.nextInt(100);
        //System.out.println(num);
       
        int palpite = 0;
        int tentativa = 0;
            
        while(palpite != num){
            System.out.print("Dê seu palpite: ");
            palpite = scan.nextInt();
            tentativa++;

         if(palpite > num)
          System.out.println("*PALPITE MAIOR QUE O NÚMERO*");
         else if (palpite < num)
           System.out.println("*PALPITE MENOR QUE O NÚMERO*");

         else if (palpite == num)
            System.out.println("ACERTOU");
            
            }

            System.out.println("Você tentou: " +tentativa + " vezes");
            
        scan.close();
    }
    
}

package Exercicio_1;
import java.util.Scanner;

public class Questao1{

    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println ("Digite aqui o diâmetro: ");
        double d = scan.nextDouble();
        double r = d/2;
        double a = 3.14 * (r*r);
        double p = 2 * 3.14 * r;

        System.out.printf ("O valor da area é: %.2f\n", a);
        System.out.printf ("A area do perimetro é %.2f\n: ", p);
        scan.close();
    }
}
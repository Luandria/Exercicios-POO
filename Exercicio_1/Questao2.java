package Exercicio_1;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do primeiro lado: ");
        double a = scan.nextDouble();
        System.out.println("Informe o tamanho do segundo lado: ");
        double b = scan.nextDouble();
        System.out.println("Informe o tamanho do terceiro lado: ");
        double c = scan.nextDouble();
    
        if(a > b+c || b > a+c || c > a+b)
         System.out.println("Não é possivel formar os lados de um triângulo com esses valores! ");
        else if (a == b & a==c & b ==c)
         System.out.println("Equilátero. ");
        else if (a==b || b==c || a==c)
         System.out.println("Isóceles. ");
        else if (a!=b || b!=c || c!=a)
         System.out.println("Escaleno. ");


        scan.close();
    }
    
}

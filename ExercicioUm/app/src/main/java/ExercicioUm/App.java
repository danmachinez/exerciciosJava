package ExercicioUm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int soma;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um valor, confirme, depois digite outro valor: ");
        
        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();
        
        soma = numero1 + numero2;
                
        System.out.println("A soma dos valores é " + soma);
       
    }
}

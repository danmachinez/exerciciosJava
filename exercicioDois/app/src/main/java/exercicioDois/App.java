package exercicioDois;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int soma;
        int subtracao;
        int multiplicacao;
        int divisao;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número, confirme, depois digite outro número: ");
        
        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();
        soma = numero1 + numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;
        
        System.out.println("A soma dos números é: "+soma);
        System.out.println("A multiplicação dos números é: "+multiplicacao);
        System.out.println("A divisão dos números é: "+divisao);
    }
}

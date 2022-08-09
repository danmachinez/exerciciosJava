package exercicioDez;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int prestacoes = 5;
        float valorCompras;
        float valorPrestacoes;
        
        System.out.println("Digite o total valor de sua compra: ");
        valorCompras = sc.nextFloat();
        
        valorPrestacoes = valorCompras / prestacoes;
        
        System.out.println("O valor de suas compras parcelados em 5x sem juros é de: R$ "+valorPrestacoes);
        
        
        
    }
}

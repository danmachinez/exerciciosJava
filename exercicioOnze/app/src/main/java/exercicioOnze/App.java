package exercicioOnze;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float precoCusto;
        int percentualLucro;
        float valorVenda;
        
        System.out.println("Digite o preço de custo do produto: ");
        precoCusto = sc.nextFloat();
        
        System.out.println("Digite o percentual de acréscimo sobre o produto: ");
        percentualLucro = sc.nextInt();
        
        valorVenda = (precoCusto * percentualLucro) / 100 + precoCusto;
        
        System.out.println("O valor de venda desse produto será de: R$ "+valorVenda);
        
    }
}

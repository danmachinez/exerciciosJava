package exercicioDoze;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int percentualDistribuidor = 28;
        int percentualImpostos = 45;
        float custoFabrica;
        float custoConsumidor;
        float custoFinal;
        float valorReal;
        
        System.out.println("Qual o custo de fábrica do carro: ");
        custoFabrica = sc.nextFloat();
        
        custoConsumidor = (custoFabrica * percentualImpostos) / 100;
        
        custoFinal = (custoConsumidor * percentualDistribuidor) / 100;
        
        valorReal = custoFabrica + custoFinal;
        
        System.out.println("O valor final do veículo será d: R$ "+valorReal);
        
        
    }
}

package exercicioOito;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float cotacaoDolar;
        float valorEmDolar;
        float valorEmReais;
        
        System.out.println("Qual é a cotação do dólar atual? ");
        cotacaoDolar = sc.nextFloat();
        
        System.out.println("Qual a valor que você deseja converter para Real? ");
        valorEmDolar = sc.nextFloat();
        
        valorEmReais = valorEmDolar / cotacaoDolar;
        
        System.out.println("O valor convertido é de R$ "+valorEmReais);
        

    }
}

package exercicioNove;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        float valorInvestido;
        float juroFixo = 0.07f;
        float rendimentoFinal;
        
        System.out.println("Deposite um valor a ser investido: ");
        valorInvestido = sc.nextFloat();
        
        rendimentoFinal = (valorInvestido * juroFixo) + valorInvestido;
        
        System.out.println("O valor depositado, após um mês de rendimento será de: R$ "+rendimentoFinal);
          
        
    }
}

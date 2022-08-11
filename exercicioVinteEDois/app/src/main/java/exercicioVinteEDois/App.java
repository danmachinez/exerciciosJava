package exercicioVinteEDois;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
       
        int i = 0;
        for (; i < 2; i++) {
            
            System.out.println("Digite o nome do produto");
            nomeProduto = sc.next();
            
            System.out.println("Digite o preço de custo do produto");
            precoCusto = sc.nextFloat();
            
            System.out.println("Digite o preço de venda do produto");
            precoVenda = sc.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoCusto == precoVenda) {
                System.out.println("Houve um empate entre os preços.");
            }else{
                if (precoCusto > precoVenda){
                    System.out.println("Houve um prejuízo.");
                }else{
                    System.out.println("Houve lucro!");
                }
            }
            
            System.out.println(nomeProduto + ", Preço de custo = "+ precoCusto 
                    +", Preço de venda = "+ precoVenda);
    }
        System.out.println("A média do preço de custo é de: " + (totalCusto / i));
        System.out.println("A média do preço de venda é de: " + (totalVenda / i));
    }
}

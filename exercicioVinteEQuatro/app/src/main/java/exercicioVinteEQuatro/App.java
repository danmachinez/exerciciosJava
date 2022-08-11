package exercicioVinteEQuatro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            
            if(numero == 0) {
                System.out.println("O número é 0");
            } else {
                if(numero > 0){
                    System.out.println("O número é maior que 0");
                }else{
                    System.out.println("O número é menor que 0");
                }
            }
            
            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = sc.next().charAt(0);
            
        }
        
        
    }
}

package exercicioTres;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int km;
        int combustivel;
        int media;
        
        System.out.println("Digite primeiro a distância percorrida, confirme e depois digite o total de combústivel gasto:");
        
        km = leitor.nextInt();
        combustivel = leitor.nextInt();
        
        media = km / combustivel;
        
        System.out.println("O consumo médio feito foi de "+media+" Km/l");
        
    }
}

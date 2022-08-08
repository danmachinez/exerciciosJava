package exercicioCinco;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        String nome;
        float nota1;
        float nota2;
        float nota3;
        float media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno(a): ");
        nome = sc.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextFloat();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A media das notas foi de "+media);
        
        
    }
}

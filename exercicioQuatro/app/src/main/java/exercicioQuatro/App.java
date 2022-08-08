package exercicioQuatro;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
   
        String nome;
        float salarioFixo;
        float vendas;
        int comissao = 15;
        float salarioFinal;
        float vendasComissionadas;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();      
        
        System.out.println("Digite seu salário fixo: R$ ");
        salarioFixo = leitor.nextFloat();
        
        System.out.println("Digite o valor total de vendas realizadas no mês(em dinheiro): R$ ");
        vendas = leitor.nextFloat();
        
        vendasComissionadas = (vendas * comissao) / 100;
        salarioFinal = salarioFixo + vendasComissionadas;
        
        System.out.println("Baseado nas informações fornecidas seu nome é: "+nome+", seu salário fixo é de R$ "+salarioFixo+" ; e seu salário no final do mês baseado na sua comissão é R$: "+salarioFinal);
        
        
        
        
    }
}

package exercicioQuatorze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorUm;
        int valorDois;

        System.out.println("Digite um valor inteiro: ");
        valorUm = sc.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        valorDois = sc.nextInt();

        if (valorUm > valorDois) {
            System.out.println("O primeiro valor é maior que o segundo");
            if (valorUm == valorDois) {
                System.out.println("Os valores são iguais!!");
                } else {
                }
            } else {
                System.out.println("O segundo valor é maior que o primeiro");
            }

    }
}

package exercicioSete;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float tempCelsius;
        float tempFahrenheit;
        
        System.out.println("Insira a temperatura em Celsius que deseja converter para Fahrenheit: ");
        tempCelsius = sc.nextFloat();
        
        tempFahrenheit = (9 * tempCelsius + 160) / 5;
        
        System.out.println("A temperatura inserida ja convertida é de "+tempFahrenheit+"°F");
        
        
        
    }     
}

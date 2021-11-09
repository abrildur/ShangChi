import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double numero;

        System.out.print("Digite un numero: ");
        numero = entrada.nextDouble();

        System.out.println("El numero es: " + numero);
    }
}

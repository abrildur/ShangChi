import java.util.Scanner;

public class Hi {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("Digite un numero: ");
        letra = entrada.next().charAt(0);

        //te va a leer el primer caracter que escribas

        System.out.println("El primer char es: " + letra);
    }
    
}

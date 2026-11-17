
import java.util.Scanner;

public class ValidarEnteros {

    double numero;

    void validar(double numero) {

        if (numero % 1 == 0) {

            System.out.println("Es un numero entero");

        } else {

            System.out.println("No es un numero entero");

        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ValidarEnteros v = new ValidarEnteros();

        System.out.print("Ingresa un numero: ");
        double numero = entrada.nextDouble();

        v.validar(numero);

        entrada.close();
    }
}

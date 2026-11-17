
import java.util.Scanner;

public class AreaCirculo {

    double radio;

    void validarNumero(Scanner entrada) {

        if (entrada.hasNextDouble()) {

            radio = entrada.nextDouble();

            if (radio > 0) {

                calcularArea(radio);

            } else {

                System.out.println("Ingresa un numero positivo.");

            }

        } else {

            System.out.println("Dato no valido.");

        }

    }

    void calcularArea(double radio) {

        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        AreaCirculo circulo = new AreaCirculo();

        System.out.print("Ingresa el radio: ");

        circulo.validarNumero(entrada);

        entrada.close();

    }
}

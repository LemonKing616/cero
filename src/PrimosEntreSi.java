import java.util.Scanner;

public class PrimosEntreSi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se leen los dos números enteros positivos
        System.out.println("Introduzca el primer número entero positivo:");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo número entero positivo:");
        int n2 = sc.nextInt();

        // Se comprueba si los números son primos entre sí
        if (esPrimoEntreSi(n1, n2)) {
            System.out.println("Los números " + n1 + " y " + n2 + " son primos entre sí.");
        } else {
            System.out.println("Los números " + n1 + " y " + n2 + " no son primos entre sí.");
        }
    }

    // Método para comprobar si dos números son primos entre sí
    private static boolean esPrimoEntreSi(int n1, int n2) {
        // Se comprueba si alguno de los números es 1
        if (n1 == 1 || n2 == 1) {
            return false;
        }

        // Se comprueba si alguno de los números es divisible por 2
        if (n1 % 2 == 0 || n2 % 2 == 0) {
            return false;
        }

        // Se comprueba si alguno de los números es divisible por 3
        if (n1 % 3 == 0 || n2 % 3 == 0) {
            return false;
        }

        // Se comprueba si alguno de los números es divisible por 5
        if (n1 % 5 == 0 || n2 % 5 == 0) {
            return false;
        }

        // Se comprueba si alguno de los números es divisible por 7
        if (n1 % 7 == 0 || n2 % 7 == 0) {
            return false;
        }

        // Se comprueba si alguno de los números es divisible por 11
        if (n1 % 11 == 0 || n2 % 11 == 0) {
            return false;
        }

        // Si ninguno de los números es divisible por ninguno de los números anteriores,
        // entonces son primos entre sí
        return true;
    }
}
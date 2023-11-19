import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se pide el número de términos de la sucesión de Fibonacci
        System.out.println("Introduzca el número de términos de la sucesión de Fibonacci:");
        int n = sc.nextInt();

        // Se inicializan los dos primeros términos de la sucesión
        int a = 0;
        int b = 1;

        // Se imprime el primer término de la sucesión
        System.out.println(a);

        // Se calculan los siguientes términos de la sucesión
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;

            // Se imprime el término calculado
            System.out.println(c);
        }
    }
}
